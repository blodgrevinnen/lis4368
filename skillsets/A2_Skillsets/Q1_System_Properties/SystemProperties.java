import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args){
        //heading
        System.out.println("Developer: Tanner Morlan");
        System.out.println("Program lists system properties.\n");

        //get system properties
        Properties prop = System.getProperties();

        //system file path separator
        String pathSeparator = System.getProperty("file.separator");
        System.out.println("System file path separator: " + pathSeparator);

        //java class path
        ClassLoader classPath = SystemProperties.class.getClassLoader();
        System.out.println("Java class path: " + classPath.getResource("SystemProperties.class"));

        //java installation directory
        String javaPath = System.getProperty("java.home");
        System.out.println("Java installation directory: " + javaPath);

        //java vendor name
        System.out.println ("Java vendor name: " + prop.getProperty("java.vendor"));

        //java vendor url
        System.out.println("Java vendor url: " + prop.getProperty("java.vendor.url"));

        //java version number
        System.out.println("Java version number: " + prop.getProperty("java.version"));

        //jre version
        System.out.println("JRE version: " + prop.getProperty("java.runtime.version"));

        //os architecture
        System.out.println("OS architecture: " + prop.getProperty("os.arch"));

        //os name
        System.out.println("OS name: " + prop.getProperty("os.name"));

        //os version
        System.out.println("OS version: " + prop.getProperty("os.version"));

        //path separator used in java.class.path
        System.out.println("Path separator used in java.class.path " + prop.getProperty("path.separator"));

        //user working directory
        System.out.println("User working directory: " + prop.getProperty("user.dir"));

        //user home directory
        System.out.println("User home directory: " + prop.getProperty("user.home"));

        //user account name
        System.out.println("User account name: " + prop.getProperty("user.name"));

    }
}