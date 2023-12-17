class Scratch {


    public static void main(String[] args) {
        System.out.println("This is a 'main' method");
        myNewMethod();
        myMethodWithParam("string_param");
        String fetchedFullName = combineNames("Vin", "Diesel");
        log("Got full name: " + fetchedFullName);
    }

    static void myNewMethod() {
        System.out.println("This is a 'myNewMethod' method");
    }

    static void myMethodWithParam(String str) {
        System.out.println("This is a 'myMethodWithParam' method with param " + str);
    }

    static String combineNames(String firstName, String lastName) {
        String combinedName = firstName + " " + lastName;
        log("Well hello " + combinedName);
        return combinedName;
    }

    static void log(Object anystring) {
        System.out.println(anystring);
    }

}