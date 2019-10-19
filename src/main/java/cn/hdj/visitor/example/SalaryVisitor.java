package cn.hdj.visitor.example;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 16:28
 * @description:
 */
public class SalaryVisitor implements ITotalSalaryVisitor {

    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;


    @Override
    public void visit(CommonEmployee commonEmployee) {
        int salary = commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
        commonTotalSalary += salary;
    }

    @Override
    public void visit(Manager manager) {
        int salary = manager.getSalary() * MANAGER_COEFFICIENT;
        managerTotalSalary += salary;
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
