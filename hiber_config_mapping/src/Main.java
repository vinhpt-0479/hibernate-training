import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Tạo một đối tượng mới và lưu vào cơ sở dữ liệu
        Student entity = new Student();
        entity.setName("Test Name");
        entity.setEmail("test@example.com");
        entity.setPhone("1234567890");
        session.save(entity);

        session.close();
    }
}