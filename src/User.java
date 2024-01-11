public class User {
    private String name;
    private Integer age;

    private static User userSigleton;
    public static User getUserSigleton() {
        if (userSigleton == null ){
            userSigleton = new User();
        }
        return userSigleton;
    }

    private User() {
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
