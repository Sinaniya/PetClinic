package spring.projects.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import speing.projects.petclinic.model.Owner;
import speing.projects.petclinic.model.Vet;
import speing.projects.petclinic.services.OwnerService;
import speing.projects.petclinic.services.VetService;
import speing.projects.petclinic.services.map.OwnerServiceMap;
import speing.projects.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    public DataLoader(){
        ownerService=new OwnerServiceMap();
        vetService=new VetServiceMap();
    }
    @Override
    public void run(String... args)throws Exception{
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sina");
        owner1.setLastName("Rafati");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Narges");
        owner1.setLastName("Ashena");

        ownerService.save(owner2);
        System.out.println("loaded owners....");

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Hasan");
        vet1.setLastName("Kechal");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Manijh");
        vet1.setLastName("Kakolbesar");
        vetService.save(vet2);
        System.out.println("Loaded Vets...");


    }
}
