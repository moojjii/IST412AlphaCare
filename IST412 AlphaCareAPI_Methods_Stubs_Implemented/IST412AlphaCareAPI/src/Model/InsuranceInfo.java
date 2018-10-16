/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jxw5640
 */

public class InsuranceInfo {
    private String name;
    private Date startDate;
    private Date endDate;
    private String coverageDescription;
    private ArrayList<InsuranceInfo> theListOfInsuranceInfo;
    
    /**
     * This is the default constructor for the insuranceInfo class.
     */
    public InsuranceInfo(){
         
     }

    /**
     * This returns the name for the customer with the insurance plan
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * This returns the starting date of the insurance plan.
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This returns the ending date of the insurance plan.
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This returns the description for the coverage.
     * @return the coverageDescription
     */
    public String getCoverageDescription() {
        return coverageDescription;
    }
    
    /**
    * This returns the list of insurance information for this class. 
     * @return an ArrayList representing the list of insurance information for this InsurnaceInfoList. 
    */
    public ArrayList getInsuranceInfoList(){
        return theListOfInsuranceInfo;
    }
    
    
    
}
