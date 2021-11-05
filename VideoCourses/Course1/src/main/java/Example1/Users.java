package Example1;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.SessionFactory;

public class Users {
    
    @Getter@Setter
    private long id;
    
    @Getter@Setter
    private String firstName;
    
    @Getter@Setter
    private String lastName;
    
    @Getter@Setter
    private int age;

    @Getter@Setter
    private Role role;//Связь один к одному

    public Users() {
    }

    public static void main(String[] args) {

        SessionFactory hibernateUtil = HibernateUtil.getSessionFactory();
    }
}
