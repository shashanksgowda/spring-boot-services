package Entity;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private double total;
    private String groupId;
    private Map<String, Double> split = new HashMap<>();
    private Map<String, Double> paidBy = new HashMap<>();

    public Bill(){

    }

    public Bill(double total, String groupId) {
        this.total = total;
        this.groupId = groupId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Map<String, Double> getSplit() {
        return split;
    }

    public void setSplit(Map<String, Double> split) {
        this.split = split;
    }

    public Map<String, Double> getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Map<String, Double> paidBy) {
        this.paidBy = paidBy;
    }
}
