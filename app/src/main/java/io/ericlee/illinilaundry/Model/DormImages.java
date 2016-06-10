package io.ericlee.illinilaundry.Model;

import java.util.Dictionary;
import java.util.Hashtable;

import io.ericlee.illinilaundry.R;

public class DormImages {

    public static DormImages instance;

    private Dictionary<String, Integer> images;

    private DormImages() {
        images = new Hashtable<>(30);

        // TODO: Get all the dorm pictures!

        images.put("Allen", R.drawable.allen);
        images.put("Barton-Lundgren", R.drawable.bartonlundgren);
        images.put("Bousfield Rm 103", R.drawable.bousfield);
        images.put("Busey-Evans", R.drawable.buseyevans);
        images.put("Daniels North", R.drawable.daniels);
        images.put("Daniels South", R.drawable.daniels);
        images.put("FAR: Oglesby", R.drawable.far);
        images.put("FAR: Trelease", R.drawable.far);
        images.put("300 South Goodwin", R.drawable.lar);        // TODO:
        images.put("1107 West Green", R.drawable.lar);          // TODO:
        images.put("Hopkins", R.drawable.lar);                  // TODO:
        images.put("ISR: Townsend", R.drawable.isrtownsend);
        images.put("ISR: Wardall", R.drawable.isr);
        images.put("LAR: Leonard", R.drawable.lar);
        images.put("LAR: Shelden", R.drawable.lar);
        images.put("Nugent", R.drawable.lar);                   // TODO:
        images.put("Nugent Rm 126", R.drawable.lar);            // TODO:
        images.put("Orchard Downs North", R.drawable.lar);      // TODO:
        images.put("Orchard Downs South", R.drawable.lar);      // TODO:
        images.put("PAR: Babcock", R.drawable.par);
        images.put("PAR: Blaisdell", R.drawable.par);
        images.put("PAR: Carr", R.drawable.par);
        images.put("PAR: Saunders", R.drawable.par);
        images.put("Scott", R.drawable.lar);                    // TODO:
        images.put("Sherman Short", R.drawable.lar);            // TODO:
        images.put("Sherman Tall", R.drawable.lar);             // TODO:
        images.put("Snyder", R.drawable.lar);                   // TODO:
        images.put("TVD: Taft", R.drawable.lar);                // TODO:
        images.put("TVD: Van Doren", R.drawable.lar);           // TODO:
        images.put("Weston", R.drawable.lar);                   // TODO:
    }

    public static DormImages getInstance() {
        if (instance == null) {
            instance = new DormImages();
        }

        return instance;
    }

    public Dictionary<String, Integer> getImages() { return images; }
}