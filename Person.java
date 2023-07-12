class Person {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;

    public Person(String firstName, String lastName, String birthDate, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getInfo() {
        return firstName + " " + lastName + ", " + birthDate + ", " + gender;
    }
}
