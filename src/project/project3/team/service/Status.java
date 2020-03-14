package project.project3.team.service;

/**
 * ToDo
 *      表示员工的三种状态
 * @authorLong
 * @Date2020/2/27 11:47
 */
public class Status {

    private final String NAME;

    private Status(String name) {
        NAME = name;
    }
    public static  final Status  FREE = new Status("FREE");
    public static  final Status  BUSY = new Status("BUSY");
    public static  final Status  VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }
}
