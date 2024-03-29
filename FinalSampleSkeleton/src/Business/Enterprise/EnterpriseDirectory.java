/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.ClinicEnterprise.Clinic;
import Business.Enterprise.HospitalEnterprise.Hospital;
import Business.Enterprise.InsuranceEnterprise.Insurance;
import Business.Enterprise.LabEnterprise.Lab;
import Business.Enterprise.PharmacyEnterprise.Pharmacy;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new Hospital(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Clinic){
            enterprise=new Clinic(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new Pharmacy(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Lab){
            enterprise=new Lab(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new Insurance(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
