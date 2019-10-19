package cn.hdj.visitor.example;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/18 23:36
 * @description: 普通员工类
 */
public class CommonEmployee extends Employee {

    /**
     * 工作
     */
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
