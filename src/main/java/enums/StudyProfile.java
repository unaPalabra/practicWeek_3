package enums;

public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика"),
    GEOLOGY("Геология"),
    GENETIC_ENGINEERING("Генная инженерия");

    private final String profileName;
    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
    public String getProfileName() {
        return profileName;
    }
}
