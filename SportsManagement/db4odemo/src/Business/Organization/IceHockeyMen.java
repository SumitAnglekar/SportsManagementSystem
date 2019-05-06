/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Coach;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class IceHockeyMen extends Organization{

    public IceHockeyMen() {
        super(Organization.Type.Coach.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Coach());
        return roles;
    }
     
   
    
    
}
