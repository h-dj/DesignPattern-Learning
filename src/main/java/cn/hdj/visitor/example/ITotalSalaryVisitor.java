package cn.hdj.visitor.example;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 16:48
 * @description:
 */
public interface ITotalSalaryVisitor extends IVisitor {

    /**
     * 全部员工的薪水
     *
     * @return
     */
    int getTotalSalary();
}
