package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements IAdminRepository{

    private static IAdminRepository repository=null;
    private List<Admin> adminList;

    private AdminRepository(){
        adminList =new ArrayList<Admin>();

    }
    public static IAdminRepository getRepository(){
        if(repository==null){
            repository=new AdminRepository();
        }
        return repository;
    }



    @Override
    public List<Admin> getAll() {
        return adminList;
    }

    @Override
    public Admin create(Admin admin) {
        boolean created =adminList.add(admin);
        if(created) {
            return admin;
        }
        return null;
        }



    @Override
    public Admin read(Integer id) {
        for(Admin a:adminList)
            if(a.getAdminID()==(id)) {
                return a;
            }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        Integer id=admin.getAdminID();
        Admin adminID=read(id);
                if(adminID==null){
                    return null;
                }

        boolean found =delete(id);
                if(found){
                    if(adminList.add(admin))
                        return admin;
        }

        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Admin deleteAdmin = read(id);
        if (deleteAdmin == null){
            return false;

    }
        return true;
    }
}
