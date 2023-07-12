interface FileHandler {
    void saveToFile(Tree<?> tree, String fileName);

    Tree<Person> loadFromFile(String fileName);
}
