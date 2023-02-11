import builder.CakeBuilder;
import cakes.Cake;
import cakes.ChocolateCake;
import cakes.Ingredient;
import cakes.PrincessCake;
import org.junit.jupiter.api.*;


public class CakeBuilderTestClass {

    @Test
    void getCorrectCakeBack(){
        Cake pc = new CakeBuilder(new PrincessCake()).addBottomLayer(new Ingredient("Tårtbotten"))
                .addFirstLayerTopping(new Ingredient("Vaniljkräm"))
                .addMidLayer(new Ingredient("Tårtbotten"))
                .addSeconLayerTopping(new Ingredient("Vaniljkräm"))
                .addTopLayer(new Ingredient("tårtbotten"))
                .bake();
        Assertions.assertInstanceOf(PrincessCake.class, pc);
        Assertions.assertEquals(pc.getBottomLayer(), "Tårtbotten");

        pc = new CakeBuilder(new ChocolateCake()).addBottomLayer(new Ingredient("Chokladtårtbotten"))
                .addFirstLayerTopping(new Ingredient("Chokladsmörkräm"))
                .addMidLayer(new Ingredient("Chokladtårtbotten"))
                .addSeconLayerTopping(new Ingredient("hallonsylt"))
                .addTopLayer(new Ingredient("Chokladtårtbotten"))
                .bake();
        Assertions.assertInstanceOf(ChocolateCake.class, pc);
        Assertions.assertEquals("Chokladtårtbotten", pc.getBottomLayer());
        Assertions.assertEquals(pc.getClass(), ChocolateCake.class);
    }
    @Test
    void testEveryComponentSeparately(){
        PrincessCake pc = new PrincessCake();
        CakeBuilder cb = new CakeBuilder(pc);

        cb.addBottomLayer(new Ingredient("Tårtbotten"));
        Assertions.assertEquals(pc.getBottomLayer(), "Tårtbotten");
        cb.addFirstLayerTopping(new Ingredient("Vaniljkräm"));
        Assertions.assertEquals(pc.getFirstLayerTopping(), "Vaniljkräm");
        cb.addMidLayer(new Ingredient("Tårtbotten"));
        Assertions.assertEquals(pc.getMidLayer(), "Tårtbotten");
        cb.addSeconLayerTopping(new Ingredient("Vaniljkräm"));
        Assertions.assertEquals(pc.getSecondLayerTopping(), "Vaniljkräm");
        cb.addTopLayer(new Ingredient("Tårtbotten"));
        Assertions.assertEquals(pc.getTopLayer(), "Tårtbotten");

        Assertions.assertInstanceOf(PrincessCake.class, cb.bake());
    }
}
