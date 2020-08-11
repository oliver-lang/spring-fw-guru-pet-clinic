package springfwgurupetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springfwgurupetclinic.model.Owner;
import springfwgurupetclinic.model.Vet;
import springfwgurupetclinic.services.OwnerService;
import springfwgurupetclinic.services.VetService;
import springfwgurupetclinic.services.map.OwnerServiceMap;
import springfwgurupetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        System.out.println("DataLoader.DataLoader");
        ownerService = new OwnerServiceMap();
        vetService =  new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataLoader.run");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners!");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet1);

        System.out.println("Loaded Vets!");
    }
}
