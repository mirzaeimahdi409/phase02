package model.employee;

import lombok.*;
import model.user.User;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Employee extends User {
    @Getter
    @Setter
    private static ArrayList<Employee> employees = new ArrayList<>();
    private boolean enablefollowme;
    private boolean sendmenotifications;
    private boolean sendTextmessages;
    private boolean enabletagging;
    private String createdAt;
    private String updatedAt;
    private int livelng;
    private int livelat;
    private int creditBalance;
    private int myCash;

}
