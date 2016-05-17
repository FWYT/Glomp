package com.example.frances.jeffjeff;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Frances on 5/16/2016.
 */
public class recipe extends AppCompatActivity implements View.OnClickListener {

    Button breakfast;
    Button lunch;
    Button dinner;
    Button dessert;
    Button pork;
    Button beef;
    Button chicken;
    Button fish;
    Button tofu;
    Button cake;
    Button pastry;

    boolean bft = false;
    boolean lch = false;
    boolean din = false;
    boolean des = false;
    boolean pk = false;
    boolean bf = false;
    boolean ck = false;
    boolean fs = false;
    boolean tf = false;
    boolean cke = false;
    boolean psty= false;

    TextView txt;

    List<String> bfast = new ArrayList<String>();
    List<String> pok = new ArrayList<String>();
    List<String> bef = new ArrayList<String>();
    List<String> cck = new ArrayList<String>();
    List<String> fsh = new ArrayList<String>();
    List<String> tof = new ArrayList<String>();
    List<String> ccke = new ArrayList<String>();
    List<String> pst = new ArrayList<String>();

    List<String> res = new ArrayList<String>();

    WebView web;
    Button next;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

        bft = false;
        lch = false;
        din=false;
        des = false;
        pk = false;
        bf = false;
        ck = false;
        fs = false;
        tf = false;
        cke = false;
        psty = false;

        breakfast = (Button)findViewById(R.id.breakfast);
        breakfast.setOnClickListener(this);

        lunch = (Button)findViewById(R.id.lunch);
        lunch.setOnClickListener(this);

        dinner = (Button)findViewById(R.id.dinner);
        dinner.setOnClickListener(this);

        dessert = (Button)findViewById(R.id.dessert);
        dessert.setOnClickListener(this);

        pork = (Button)findViewById(R.id.pork);
        pork.setOnClickListener(this);

        beef = (Button)findViewById(R.id.beef);
        beef.setOnClickListener(this);

        chicken = (Button)findViewById(R.id.chicken);
        chicken.setOnClickListener(this);

        fish = (Button)findViewById(R.id.fish);
        fish.setOnClickListener(this);

        tofu = (Button)findViewById(R.id.tofu);
        tofu.setOnClickListener(this);


        cake = (Button)findViewById(R.id.cake);
        cake.setOnClickListener(this);

        pastry = (Button)findViewById(R.id.pastry);
        pastry.setOnClickListener(this);

        web = (WebView) findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        next = (Button) findViewById(R.id.nextRec);
        next.setOnClickListener(this);

        //create lists
        pst.addAll(Arrays.asList("http://www.foodnetwork.com/recipes/ina-garten/panna-cotta-with-balsamic-strawberries-recipe.html", "http://www.williams-sonoma.com/recipe/bread-pudding.html",
                                 "http://www.christinesrecipes.com/2009/03/cantonese-egg-tarts.html", "http://www.realsimple.com/food-recipes/browse-all-recipes/palmiers",
                                 "http://www.daydaycook.com/recipe/2/details/26291/tips/index.html#detailTab", "http://addapinch.com/chewy-sugar-cookies-recipe/", "http://sweetheartkitchen.com/recipes/chinese-new-year-sticky-rice-cake/",
                                 "http://www.eatcakefordinner.net/2011/04/texas-roadhouse-rolls-copycat-recipe.html", "http://www.epicurious.com/recipes/food/views/old-fashioned-lattice-top-apple-pie-102411",
                                 "https://www.verybestbaking.com/recipes/144592/soft-cinnamon-and-sugar-pretzels/", "http://sweetheartkitchen.com/recipes/baked-curry-puffs/", "http://sweetheartkitchen.com/recipes/taiyaki/",
                                 "http://sweetheartkitchen.com/recipes/chinese-walnut-biscuits/","http://sweetheartkitchen.com/recipes/soy-milk-pudding/", "http://www.justonecookbook.com/korean-pancake/",
                                 "http://www.myrecipes.com/recipe/banana-cinnamon-waffles", ""));

        ccke.addAll(Arrays.asList("http://smittenkitchen.com/blog/2010/04/lime-yogurt-cake-with-blackberry-sauce/", "http://www.kraftrecipes.com/recipes/philadelphia-classic-cheesecake-52544.aspx",
                                  "http://kirbiecravings.com/2012/03/cookies-and-cream-mug-cake.html", "http://www.kraftrecipes.com/recipes/fruity-cheesecake-74541.aspx", "http://www.gimmesomeoven.com/rum-cake-from-scratch/",
                                  "http://www.foodnetwork.com/recipes/paula-deen/mamas-pound-cake-recipe.html", "http://allrecipes.com/recipe/7757/tiramisu-cheesecake/?internalSource=recipe%20hub&referringId=387&referringContentType=recipe%20hub",
                                  "http://allrecipes.com/recipe/9346/chocolate-cookie-cheesecake/?internalSource=recipe%20hub&referringId=387&referringContentType=recipe%20hub",
                                  "http://allrecipes.com/recipe/25642/white-chocolate-raspberry-cheesecake/?internalSource=recipe%20hub&referringId=387&referringContentType=recipe%20hub",
                                  "http://allrecipes.com/recipe/179674/philly-bavarian-apple-torte/?internalSource=recipe%20hub&referringId=387&referringContentType=recipe%20hub",
                                  "http://sweetheartkitchen.com/recipes/peach-yogurt-cheesecake/", "http://www.tasteofhome.com/recipes/lime-cheesecake", "http://sweetheartkitchen.com/recipes/no-bake-blueberry-yogurt-cake/",
                                  "http://en.christinesrecipes.com/2016/03/matcha-marble-chiffon-cake.html#more"));

        tof.addAll(Arrays.asList("http://sweetheartkitchen.com/recipes/mushroom-rice/", "http://sweetheartkitchen.com/recipes/broccoli-christmas-tree/",
                                 "http://www.justonecookbook.com/mapo-tofu/", "http://www.justonecookbook.com/vegetarian-ramen/", "http://www.justonecookbook.com/stir-fry-vegetables/", "http://www.justonecookbook.com/yaki-udon/",
                                 "http://en.christinesrecipes.com/2016/01/stir-fried-shiitake-mushroom-chicken.html#more", "http://en.christinesrecipes.com/2014/11/teriyaki-tofu.html", "http://en.christinesrecipes.com/2014/08/tofu-pork-mince-patties.html",
                                 "http://en.christinesrecipes.com/2013/04/baked-eggplant-with-miso-sauce.html", "http://www.myrecipes.com/recipe/mediterranean-orzo-salad-with-feta-vinaigrette",
                                 "http://www.myrecipes.com/recipe/creamy-light-macaroni-cheese", "http://www.myrecipes.com/recipe/baked-ziti-summer-veggies", "http://www.thehongkongcookery.com/2015/03/pan-fried-tofu-stuffed-with-fish-paste.html",
                                 "http://www.thehongkongcookery.com/2011/09/soybean-sprouts-dried-tofu-stir-fry.html", "http://www.thehongkongcookery.com/2011/10/tomato-egg-stir-fry-grandmas-style.html",
                                 "http://www.thehongkongcookery.com/2013/01/chinese-steamed-eggplant.html", "http://www.thehongkongcookery.com/2014/05/spinach-with-gold-silver-eggs.html",
                                 "http://www.thehongkongcookery.com/2014/11/stir-fry-chinese-pea-shoots.html", "http://www.thehongkongcookery.com/2016/05/vietnamese-beef-vermicelli-noodles-bun.html"));


        cck.addAll(Arrays.asList("http://sweetheartkitchen.com/recipes/numeric-chicken-wings/",
                                 "http://www.justonecookbook.com/teriyaki-chicken-quesadilla/", "http://www.justonecookbook.com/pressure-cooker-japanese-curry/", "http://www.justonecookbook.com/grilled-chicken-with-teriyaki-sauce/",
                                 "http://www.justonecookbook.com/slow-cooker-chicken-wings/", "http://www.justonecookbook.com/ootoya-sweet-and-sour-chicken-tori-kurozu-an/", "http://en.christinesrecipes.com/2016/03/indian-style-baked-chicken-wings.html#more",
                                 "http://en.christinesrecipes.com/2016/01/stir-fried-shiitake-mushroom-chicken.html#more", "http://en.christinesrecipes.com/2015/11/honey-balsamic-chicken-wings.html#more",
                                 "http://en.christinesrecipes.com/2014/09/korean-chilli-chicken-stir-fry.html", "http://www.myrecipes.com/recipe/roasted-chicken-bow-tie-pasta-salad", "http://www.myrecipes.com/recipe/asparagus-chicken-carbonara",
                                 "http://www.thehongkongcookery.com/2011/09/rosemary-garlic-chicken-wings-house.html", "http://www.thehongkongcookery.com/2012/04/soy-sauce-chicken-wings.html",
                                 "http://www.thehongkongcookery.com/2014/06/chinese-drunken-chicken-wings.html", "http://www.thehongkongcookery.com/2014/08/three-cup-four-flavors-chicken.html"));

        bef.addAll(Arrays.asList("http://mykoreankitchen.com/bulgogi-korean-bbq-beef/", "http://www.justonecookbook.com/pressure-cooker-short-ribs/", "http://www.justonecookbook.com/beef-udon/", "http://www.justonecookbook.com/stuffed-cabbage-rolls/",
                                 "http://www.justonecookbook.com/loco-moco/", "http://www.justonecookbook.com/yaki-udon/", "http://en.christinesrecipes.com/2015/01/korean-braised-beef-short-ribs.html#more",
                                 "http://www.thehongkongcookery.com/2013/07/chinese-spiced-beef-shin.html", "http://www.thehongkongcookery.com/2015/11/stir-fry-beef-udon-noodles.html",
                                 "http://allrecipes.com/recipe/77194/bolognese-stuffed-bell-peppers/?internalSource=staff%20pick&referringId=200&referringContentType=recipe%20hub",
                                 "http://allrecipes.com/recipe/220059/chef-johns-classic-beef-stroganoff/?internalSource=staff%20pick&referringId=200&referringContentType=recipe%20hub",
                                 "http://allrecipes.com/recipe/30578/filet-mignon-with-rich-balsamic-glaze/?internalSource=staff%20pick&referringId=200&referringContentType=recipe%20hub",
                                 "http://www.tasteofhome.com/recipes/korean-beef-and-rice", "http://www.cdkitchen.com/recipes/recs/364/CocaCola_Roast_Beef14714.shtml", "http://www.yummly.com/recipe/external/Mongolian-Beef-1603306",
                                 "http://www.lecremedelacrumb.com/2016/02/20-minute-beijing-beef.html", "http://www.yummly.com/recipe/external/Beef-Tapa-1631397", "http://www.yummly.com/recipe/external/BRAZILIAN-BEEF-RAGU_-PICADINHO-1623622",
                                 "http://www.yummly.com/recipe/external/Garlic-Beef-Stir-fry-1586449", "http://realhousemoms.com/slow-cooker-italian-pepperoncini-shredded-beef/", "http://www.skinnytaste.com/barbacoa-beef/"));

        pok.addAll(Arrays.asList("http://lindawu122470.pixnet.net/blog/post/151529944-%E8%87%AA%E5%B7%B1%E5%81%9A%E5%8F%89%E7%87%92%E8%82%89%EF%BC%8C%E5%8F%89%E7%87%92%E9%86%AC", "http://www.justonecookbook.com/mille-feuille-nabe/",
                                 "http://www.justonecookbook.com/stuffed-cabbage-rolls/", "http://www.justonecookbook.com/loco-moco/", "http://www.justonecookbook.com/yaki-udon/", "http://en.christinesrecipes.com/2015/09/thai-mince-pork-rice.html#more",
                                 "http://en.christinesrecipes.com/2014/08/tofu-pork-mince-patties.html", "http://en.christinesrecipes.com/2013/08/japanese-ginger-pork.html", "http://en.christinesrecipes.com/2013/04/braised-honey-pork-ribs.html",
                                 "http://www.myrecipes.com/recipe/fresh-tomato-sausage-pecorino-pasta", "http://www.myrecipes.com/recipe/fettuccine-alfredo-with-bacon", "http://www.thehongkongcookery.com/2014/03/chinese-baked-pork-chop-rice.html",
                                 "http://www.thehongkongcookery.com/2013/03/chinese-red-cooked-pork.html", "http://www.thehongkongcookery.com/2013/09/pan-fried-pork-patty-with-salted-fish.html",
                                 "http://www.thehongkongcookery.com/2014/04/chinese-steamed-spareribs-with-black.html", "http://www.thehongkongcookery.com/2014/09/wuxi-spareribs.html",
                                 "http://www.thehongkongcookery.com/2014/12/steamed-lap-cheong-rice.html", "http://www.thehongkongcookery.com/2015/03/braised-dried-oysters-with-black-sea.html",
                                 "http://www.thehongkongcookery.com/2015/06/sweet-and-sour-pork-chop-onion.html", "http://www.thehongkongcookery.com/2016/04/stir-fry-scrambled-eggs-with-char-siu.html"));

        fsh.addAll(Arrays.asList("http://sweetheartkitchen.com/recipes/lobster-noodle/", "http://sweetheartkitchen.com/recipes/spaghetti-alle-vongole/", "http://www.justonecookbook.com/yaki-udon/","http://www.justonecookbook.com/lobster-roll/",
                                 "http://www.justonecookbook.com/how-to-cook-salmon-salted-salmon/", "http://en.christinesrecipes.com/2016/01/stir-fried-prawns-with-sweet-soy-sauce.html#more",
                                 "http://en.christinesrecipes.com/2013/09/snapper-oyster-mushroom-soup.html", "http://en.christinesrecipes.com/2013/08/malaysian-curry-fish.html","http://en.christinesrecipes.com/2013/01/singaporean-chilli-crab-recipe.html",
                                 "http://www.myrecipes.com/recipe/orecchiette-with-peas-shrimp", "http://www.thehongkongcookery.com/2011/08/soy-sauce-king-prawn-stir-fry.html", "http://www.thehongkongcookery.com/2014/03/classic-chinese-steamed-fish.html",
                                 "http://www.thehongkongcookery.com/2013/12/steamed-salted-sun-dried-fish.html", "http://www.thehongkongcookery.com/2014/08/chinese-shrimp-eggs-stir-fry.html",
                                 "http://www.thehongkongcookery.com/2016/03/chinese-steamed-fish-with-black-bean.html", "http://www.thehongkongcookery.com/2013/09/pan-fried-pork-patty-with-salted-fish.html",
                                 "http://www.thehongkongcookery.com/2015/03/braised-dried-oysters-with-black-sea.html"));

        bfast.addAll(Arrays.asList("http://sweetheartkitchen.com/recipes/numeric-chicken-wings/", "http://sweetheartkitchen.com/recipes/taiyaki/", "http://sweetheartkitchen.com/recipes/baked-curry-puffs/", "http://sweetheartkitchen.com/recipes/chinese-walnut-biscuits/",
                                   "http://sweetheartkitchen.com/recipes/broccoli-christmas-tree/", "http://sweetheartkitchen.com/recipes/stir-fried-sticky-rice/", "http://sweetheartkitchen.com/recipes/soy-milk-pudding/",
                                   "http://www.justonecookbook.com/teriyaki-chicken-quesadilla/", "http://www.justonecookbook.com/slow-cooker-chicken-wings/", "http://www.justonecookbook.com/korean-pancake/",
                                   "http://www.justonecookbook.com/lobster-roll/", "http://www.seriouseats.com/recipes/2014/06/drop-biscuit-breakfast-sandwiches-dill-feta-recipe.html",
                                   "http://www.seriouseats.com/recipes/2015/05/savory-bacon-cheddar-jalapeno-corn-pancake-recipe.html", "http://www.seriouseats.com/recipes/2015/05/chorizo-halloumi-pancakes-fried-eggs-recipe.html",
                                   "http://www.seriouseats.com/recipes/2014/09/menemen-turkish-style-scrambled-eggs-tomatoes-chilies-recipe.html", "http://www.seriouseats.com/recipes/2014/06/baked-eggs-avocado-feta-mint-recipe.html",
                                   "http://www.seriouseats.com/recipes/2014/06/puff-pastry-breakfast-egg-tarts-recipe.html", "http://www.myrecipes.com/recipe/brunch-parfaits", "http://www.myrecipes.com/recipe/hash-brown-casserole-with-bacon-onions-cheese",
                                   "http://www.myrecipes.com/recipe/banana-cinnamon-waffles", "http://www.myrecipes.com/recipe/omelet-with-summer-vegetables",
                                   "http://www.myrecipes.com/recipe/pain-perdu-2"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void deleteMeal()
    {
        View b = findViewById(R.id.breakfast);
        b.setVisibility(View.GONE);

        View l = findViewById(R.id.lunch);
        l.setVisibility(View.GONE);

        View d = findViewById(R.id.dinner);
        d.setVisibility(View.GONE);

        View ds = findViewById(R.id.dessert);
        ds.setVisibility(View.GONE);
    }

    public void deleteProtein()
    {
        View b = findViewById(R.id.beef);
        b.setVisibility(View.GONE);

        View l = findViewById(R.id.pork);
        l.setVisibility(View.GONE);

        View d = findViewById(R.id.chicken);
        d.setVisibility(View.GONE);

        View ds = findViewById(R.id.tofu);
        ds.setVisibility(View.GONE);
    }


    public void deleteDes()
    {
        View b = findViewById(R.id.cake);
        b.setVisibility(View.GONE);

        View l = findViewById(R.id.pastry);
        l.setVisibility(View.GONE);
    }


    public void showProtein()
    {
        View b = findViewById(R.id.beef);
        b.setVisibility(View.VISIBLE);

        View l = findViewById(R.id.pork);
        l.setVisibility(View.VISIBLE);

        View d = findViewById(R.id.chicken);
        d.setVisibility(View.VISIBLE);

        View ds = findViewById(R.id.tofu);
        ds.setVisibility(View.VISIBLE);
    }


    public void showDes()
    {
        View b = findViewById(R.id.cake);
        b.setVisibility(View.VISIBLE);

        View l = findViewById(R.id.pastry);
        l.setVisibility(View.VISIBLE);
    }


    public void findRec()
    {
        String s = "";

        if (bft)
        {
            res = bfast;
        }
        if (lch || din)
        {
            if (pk)
            {
                res = pok;
            }
            if (bf)
            {
                res = bef;
            }
            if (ck)
            {
                res = cck;
            }
            if (fs)
            {
                res = fsh;
            }
            if (tf)
            {
               res = tof;
            }
        }
        if (des)
        {
            if (cke)
            {
                res = ccke;
            }
            if (psty)
            {
                res = pst;
            }
        }

        View b = findViewById(R.id.web);
        b.setVisibility(View.VISIBLE);

        View n = findViewById(R.id.nextRec);
        n.setVisibility(View.VISIBLE);

        Random r = new Random();
        int i = r.nextInt((res.size() - 1) + 1);

        web.loadUrl(res.get(i));
    }

    public void nextRec()
    {
        Random r = new Random();
        int i = r.nextInt((res.size()-1) + 1);

        web.loadUrl(res.get(i));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case (R.id.breakfast):
                bft=true;
                deleteMeal();
                findRec();
                break;

            case (R.id.lunch):
                lch=true;
                deleteMeal();
                showProtein();
                break;

            case (R.id.dinner):
                din = true;
                deleteMeal();
                showProtein();
                break;

            case (R.id.dessert):
                des = true;
                deleteMeal();
                showDes();
                break;

            case (R.id.pork):
                pk=true;
                deleteProtein();
                findRec();
                break;

            case (R.id.beef):
                bf=true;
                deleteProtein();
                findRec();
                break;

            case (R.id.chicken):
                ck=true;
                deleteProtein();
                findRec();
                break;

            case (R.id.fish):
                fs=true;
                deleteProtein();
                findRec();
                break;

            case (R.id.tofu):
                tf=true;
                deleteProtein();
                findRec();
                break;


            case (R.id.cake):
                cke=true;
                deleteDes();
                findRec();
                break;

            case (R.id.pastry):
                psty=true;
                deleteDes();
                findRec();
                break;

            case (R.id.nextRec):
                nextRec();
                break;
        }
    }
}
