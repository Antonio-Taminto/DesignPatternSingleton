public class User {
    private String name;
    private Integer age;

    private static User userSigleton;
    public static User getUserSigleton() {
        if (userSigleton == null ){
            userSigleton = new User("Mario",30);
        }
        return userSigleton;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void stampa(){
        System.out.println("nome: " + name + " eta : " + age);
    }
}
