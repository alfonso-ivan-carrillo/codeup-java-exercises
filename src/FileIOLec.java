import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLec {
    // File - a discrete container for data on a storage device.
    // Path - location of a file in the filesystem.


    // Relative Path - relative to the current working directory.
    // example:  <script src="../js/weathermap.js"></script>

    // Absolute Path - specified from the filesystem root.
    // example:  /Users/alfonsocarrillo/IdeaProjects/regulus-java-exercises

    public static void main(String[] args) {

        // Path Interface - define an object that represents a path.

        // Paths Class - contains static methods to obtain a filepath.
        // .get(String filename)
        // overloaded method:  .get(String directory, String filename)
        // .get(String parentDirectory, String childDirectory, String filename)
        // All return a Path object that corresponds to the passed string(s).


        String directory = "data";
        String filename = "gods.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println(dataDirectory);
        System.out.println(directory);

        try {
            // Files class - contains static methods to read, write, create and delete files.
            // Files Class Method:   .exists(Path filepath) - checks whethere or not the file exists.
            // another Method:   .notExists(Path filepath)
            if(Files.notExists(dataDirectory)){
                Files.createDirectory(dataDirectory);
                // create a new directory if the files does not exist.
                // Method:    .createDirectory(Path filepath)
                //            .createDirectories(Path filepath)
                Files.createDirectory(dataDirectory);
            }

            if (!Files.exists(dataFile)){
                // Files method:  .createFile(Path filepath);
                Files.createFile(dataFile);
            }
            if(Files.exists(dataFile)){
                Files.write(dataFile, Arrays.asList("Zeus", "Hercules", "Aphrodite", "Poseidon", "Hephaestus", "Athena"));
                // Files Method:  Files.write(Path filepath, List<String> list, StandardOpenOption.APPEND[optional])
                // the command below would overwrite the previous write file
                // Files.write(dataFile, Arrays.asList("Hades"));

                // with the third parameter/args in the write method, it would append "hades" to the list that already exists in file
                Files.write(dataFile, Arrays.asList("Hades"), StandardOpenOption.APPEND);

            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }



        try {
            // Reading Files
            // Create a Lisit of strings that represents the file data.

            List<String> gods = Files.readAllLines(dataFile);
            for(String god : gods){
                System.out.println(god);
            }

            System.out.println(gods);


            // Create bucket to replace Hercules
            List<String> bucket = new ArrayList<>();

            for(String god : gods){
                if(god.equalsIgnoreCase("Herules")){
                    // replace Hercules with Hera, then move to the next iteration.
                    bucket.add("Hera");
                    continue;
                }
                // copy all god strings to new list
                bucket.add(god);
            }
            // re-write the file with bucket list (god list)
            Files.write(dataFile, bucket);


//            gods.remove("Hercules");
//            gods.add("Hera"); to add to list  or gods.add([index] 2, "Hera"); adds hera to index 2 of list
//            Files.write(dataFile, gods);

        }catch (IOException iox){
            iox.printStackTrace();
        }








    }

}
