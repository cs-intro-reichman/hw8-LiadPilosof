public class MyTest {

    public static void main(String[] args)
    {
    User user1 = new User("dan", true);
    user1.addFollowee("fds");
    user1.addFollowee("fds");
    System.out.println(user1);

    System.out.println(user1.follows("fds"));
    }
}
