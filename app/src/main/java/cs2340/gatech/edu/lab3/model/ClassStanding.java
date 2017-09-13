package cs2340.gatech.edu.lab3.model;

import java.io.Serializable;

/**
 * Created by Brandon on 9/13/2017.
 *
 * Class Standing for each student
 */

public enum ClassStanding implements Serializable {
    FRESHMAN ("FR"), SOPHOMORE("SO"), JUNIOR("JR"), SENIOR("SR");

    private String standing;

    ClassStanding(String standing) {
        this.standing = standing;
    }

    public String getStanding() {
        return standing;
    }

    public String toString() {
        return standing;
    }
}