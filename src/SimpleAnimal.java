import java.util.ArrayList;
import java.util.List;
//b.Create an Abstract Class SimpleAnimal that implements AnimalInteraction:
//Implement the feed method. It should ask for the food provided and store the feeding interaction in a list.
//Implement the play method. When called, it should store "play interaction" in the interaction history.
//Implement the showInteractionHistory method to display all interactions with the animal (both feedings and play sessions).
//Store interaction history using an appropriate data structure, like an ArrayList<String>.
public abstract class SimpleAnimal implements AnimalInteraction{
    protected List<String> interactionHistory = new ArrayList<>();

    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with: "+food);
    }

    @Override
    public void play() {
        interactionHistory.add("PLAYS WITH OTHER ANIMALS.")
    }

    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction history: ");
        for (String interaction : interactionHistory){
            System.out.println(interaction);
        }
    }
    public void sleep (int minutes){
        interactionHistory.add("Slept for "+minutes+" minutes");
    }
}
