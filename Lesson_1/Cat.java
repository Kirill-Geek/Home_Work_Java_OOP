public class Cat {
    /**
     * Определяем поведение класса.
     * 
     * @param nam это Имя кота.
     * @param ag  это Возраст.
     */
    Owner owner = new Owner();

    public Cat(String nam, int ag, String ownercat) {
        name = nam;
        age = ag;
        owner.name = ownercat;
    }

    private String name;
    private int age;

    // Методы для чтения Имени и Возраста.
    public String nameCat() {
        return name;
    }

    public int ageCat() {
        return age;
    }

    // Методы для изминения Имени либо Возраста.
    public void setName(String naming) {
        this.name = naming;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public String greet() {
        return String.format("Мяу! Меня зовут %s. Мне %s года(лет). Мой владелец %s", nameCat(), ageCat(),
                owner.getInfo());
    }
}