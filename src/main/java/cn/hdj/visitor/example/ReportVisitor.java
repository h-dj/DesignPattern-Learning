package cn.hdj.visitor.example;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 16:44
 * @description: 报告访问者
 */
public class ReportVisitor implements IReportVisitor {

    private StringBuffer info = new StringBuffer();

    @Override
    public void visit(CommonEmployee commonEmployee) {
        info.append(getCommonEmployee(commonEmployee));
        info.append("\n");
    }

    @Override
    public void visit(Manager manager) {
        info.append(getManagerInfo(manager));
        info.append("\n");
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    @Override
    public void report() {
        System.out.println(info.toString());
    }
}
