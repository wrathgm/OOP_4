public class GenealogyTreeApp {
    public static void main(String[] args) {
        Tree<Person> personTree = new Tree<>(new Person("John", "Doe", "01-01-1980", "M"));
        UserInterface userInterface = new UserInterface(personTree);
        userInterface.start();
    }
}
