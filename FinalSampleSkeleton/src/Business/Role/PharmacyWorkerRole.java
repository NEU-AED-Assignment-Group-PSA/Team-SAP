/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import PharmacyWorkerMainWorkArea.PharmacyMainWorkAreaJPanel;
import userinterface.LabTechnicianRole.LabAssistantMainAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PharmacyWorkerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyMainWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
    @Override
    public String roleValue()
    {
        return "Pharmacy Worker Role";
    }
    
}
