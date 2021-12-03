package Static_Proxy_Pattern;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy begins");
        target.teach();
        System.out.println("proxy ends");
    }
}
