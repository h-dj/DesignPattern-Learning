package cn.hdj.visitor.example;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 16:23
 * @description: 访问者接口
 */
public interface IVisitor {
    /**
     * 访问普同员工
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 访问管理者
     *
     * @param manager
     */
    void visit(Manager manager);

}
