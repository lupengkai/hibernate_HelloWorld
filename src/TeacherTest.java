import com.hibernate.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by tage on 3/16/16.
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setId(1);
        t.setName("t1");
        t.setTitle("中级");
        t.setAge(1);

        Configuration cfg = new Configuration() ;
        SessionFactory sf = cfg.configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
