package com.example.virtualwaiter

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
//import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.android.volley.*
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import com.android.volley.toolbox.StringRequest
import com.example.virtualwaiter.finalize_order
import java.io.BufferedReader
import java.io.PrintWriter
import java.net.Socket
import java.util.*

class finalize_order : Activity() {
    var a = this
    var personal_preferances: String? = null
    var oo: Any? = null
    var fin_order_string = ""
    var S: String? = null
    override fun onBackPressed() {
        // do nothing.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalize_order)
        show_Order()
        tot_v()
        oo = this
    }

    fun show_Order() {
        if (Breakfast.scrambled_eggs > 0) {
            fin_order_string = """
                ${fin_order_string}Scrambled eggs -> ${java.lang.String.valueOf(Breakfast.scrambled_eggs)}
                
                
                """.trimIndent()
        }
        if (Breakfast.denver > 0) {
            fin_order_string = """
                ${fin_order_string}Denver omelet -> ${java.lang.String.valueOf(Breakfast.denver)}
                
                
                """.trimIndent()
        }
        if (Breakfast.sausage_omelet > 0) {
            fin_order_string = """
                ${fin_order_string}Sausage and cheese omelet -> ${java.lang.String.valueOf(Breakfast.sausage_omelet)}
                
                
                """.trimIndent()
        }
        if (Breakfast.denver > 0) {
            fin_order_string = """
                ${fin_order_string}Denver omelet -> ${java.lang.String.valueOf(Breakfast.denver)}
                
                
                """.trimIndent()
        }
        if (Breakfast.french_toast > 0) {
            fin_order_string = """
                ${fin_order_string}French Toast -> ${java.lang.String.valueOf(Breakfast.french_toast)}
                
                
                """.trimIndent()
        }
        if (Breakfast.chicken_quiche > 0) {
            fin_order_string = """
                ${fin_order_string}Chicken and Mushroom Quiche -> ${java.lang.String.valueOf(Breakfast.chicken_quiche)}
                
                
                """.trimIndent()
        }
        if (Breakfast.english_bf > 0) {
            fin_order_string = """
                ${fin_order_string}English breakfast -> ${java.lang.String.valueOf(Breakfast.english_bf)}
                
                
                """.trimIndent()
        }
        if (Appetizers.artichoke > 0) {
            fin_order_string = """
                ${fin_order_string}Artichoke and spinach dip -> ${java.lang.String.valueOf(Appetizers.artichoke)}
                
                
                """.trimIndent()
        }
        if (Appetizers.bruschetta > 0) {
            fin_order_string = """
                ${fin_order_string}Bruschetta -> ${java.lang.String.valueOf(Appetizers.bruschetta)}
                
                
                """.trimIndent()
        }
        if (Appetizers.stuffed_mushrooms > 0) {
            fin_order_string = """
                ${fin_order_string}Stuffed mushrooms -> ${java.lang.String.valueOf(Appetizers.stuffed_mushrooms)}
                
                
                """.trimIndent()
        }
        if (Appetizers.fried_calamari > 0) {
            fin_order_string = """
                ${fin_order_string}Fried calamari -> ${java.lang.String.valueOf(Appetizers.fried_calamari)}
                
                
                """.trimIndent()
        }
        if (Appetizers.artichoke > 0) {
            fin_order_string = """
                ${fin_order_string}Artichoke and spinach dip -> ${java.lang.String.valueOf(Appetizers.artichoke)}
                
                
                """.trimIndent()
        }
        if (Appetizers.four_cheese_garlic_bread > 0) {
            fin_order_string = """
                ${fin_order_string}Four cheese garlic bread -> ${java.lang.String.valueOf(Appetizers.four_cheese_garlic_bread)}
                
                
                """.trimIndent()
        }
        if (Appetizers.shrimp_scampi > 0) {
            fin_order_string = """
                ${fin_order_string}Shrimp scampi -> ${java.lang.String.valueOf(Appetizers.shrimp_scampi)}
                
                
                """.trimIndent()
        }
        if (Appetizers.french_fries > 0) {
            fin_order_string = """
                ${fin_order_string}French fries -> ${java.lang.String.valueOf(Appetizers.french_fries)}
                
                
                """.trimIndent()
        }
        if (Soup.chicken_noodle_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Chicken noodle soup -> ${Soup.chicken_noodle_soup}
                
                
                """.trimIndent()
        }
        if (Soup.vegetable_bacon_risoni_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Vegetable, bacon and risoni soup -> ${Soup.vegetable_bacon_risoni_soup}
                
                
                """.trimIndent()
        }
        if (Soup.cream_of_cauliflower_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Cream of cauliflower soup -> ${Soup.cream_of_cauliflower_soup}
                
                
                """.trimIndent()
        }
        if (Soup.pumpkin_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Pumpkin soup -> ${Soup.pumpkin_soup}
                
                
                """.trimIndent()
        }
        if (Soup.tomato_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Tomato soup -> ${Soup.tomato_soup}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.escobar > 0) {
            fin_order_string = """
                ${fin_order_string}escobar -> ${java.lang.String.valueOf(AlcoholicDrinks.escobar)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.stormtrooper > 0) {
            fin_order_string = """
                ${fin_order_string}stormtrooper -> ${java.lang.String.valueOf(AlcoholicDrinks.stormtrooper)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.easy_breezy > 0) {
            fin_order_string = """
                ${fin_order_string}easy_breezy -> ${java.lang.String.valueOf(AlcoholicDrinks.easy_breezy)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.the_drake > 0) {
            fin_order_string = """
                ${fin_order_string}the_drake -> ${java.lang.String.valueOf(AlcoholicDrinks.the_drake)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.budweiser > 0) {
            fin_order_string = """
                ${fin_order_string}budweiser -> ${java.lang.String.valueOf(AlcoholicDrinks.budweiser)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.bud_light > 0) {
            fin_order_string = """
                ${fin_order_string}bud_light -> ${java.lang.String.valueOf(AlcoholicDrinks.bud_light)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.heineken > 0) {
            fin_order_string = """
                ${fin_order_string}heineken -> ${java.lang.String.valueOf(AlcoholicDrinks.heineken)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.corona > 0) {
            fin_order_string = """
                ${fin_order_string}corona -> ${java.lang.String.valueOf(AlcoholicDrinks.corona)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.augustiner > 0) {
            fin_order_string = """
                ${fin_order_string}augustiner -> ${java.lang.String.valueOf(AlcoholicDrinks.augustiner)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.cabernet_sauvignon > 0) {
            fin_order_string = """
                ${fin_order_string}cabernet_sauvignon -> ${java.lang.String.valueOf(AlcoholicDrinks.cabernet_sauvignon)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.chardonnay > 0) {
            fin_order_string = """
                ${fin_order_string}chardonnay -> ${java.lang.String.valueOf(AlcoholicDrinks.chardonnay)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.pinot_gris > 0) {
            fin_order_string = """
                ${fin_order_string}pinot_gris -> ${java.lang.String.valueOf(AlcoholicDrinks.pinot_gris)}
                
                
                """.trimIndent()
        }
        if (AlcoholicDrinks.pinot_noir > 0) {
            fin_order_string = """
                ${fin_order_string}pinot_noir -> ${java.lang.String.valueOf(AlcoholicDrinks.pinot_noir)}
                
                
                """.trimIndent()
        }
        if (Appetizers.artichoke > 0) {
            fin_order_string = """
                ${fin_order_string}artichoke -> ${java.lang.String.valueOf(Appetizers.artichoke)}
                
                
                """.trimIndent()
        }
        if (Appetizers.bruschetta > 0) {
            fin_order_string = """
                ${fin_order_string}bruschetta -> ${java.lang.String.valueOf(Appetizers.bruschetta)}
                
                
                """.trimIndent()
        }
        if (Appetizers.stuffed_mushrooms > 0) {
            fin_order_string = """
                ${fin_order_string}stuffed_mushrooms -> ${java.lang.String.valueOf(Appetizers.stuffed_mushrooms)}
                
                
                """.trimIndent()
        }
        if (Appetizers.fried_calamari > 0) {
            fin_order_string = """
                ${fin_order_string}fried_calamari -> ${java.lang.String.valueOf(Appetizers.fried_calamari)}
                
                
                """.trimIndent()
        }
        if (Appetizers.four_cheese_garlic_bread > 0) {
            fin_order_string = """
                ${fin_order_string}four_cheese_garlic_bread -> ${java.lang.String.valueOf(Appetizers.four_cheese_garlic_bread)}
                
                
                """.trimIndent()
        }
        if (Appetizers.shrimp_scampi > 0) {
            fin_order_string = """
                ${fin_order_string}shrimp_scampi -> ${java.lang.String.valueOf(Appetizers.shrimp_scampi)}
                
                
                """.trimIndent()
        }
        if (Appetizers.french_fries > 0) {
            fin_order_string = """
                ${fin_order_string}french_fries -> ${java.lang.String.valueOf(Appetizers.french_fries)}
                
                
                """.trimIndent()
        }
        if (Burgers.crispy_burger > 0) {
            fin_order_string = """
                ${fin_order_string}crispy_burger -> ${java.lang.String.valueOf(Burgers.crispy_burger)}
                
                
                """.trimIndent()
        }
        if (Burgers.classic_american_burger > 0) {
            fin_order_string = """
                ${fin_order_string}classic_american_burger -> ${java.lang.String.valueOf(Burgers.classic_american_burger)}
                
                
                """.trimIndent()
        }
        if (Burgers.golden_chicken_burger > 0) {
            fin_order_string = """
                ${fin_order_string}golden_chicken_burger -> ${java.lang.String.valueOf(Burgers.golden_chicken_burger)}
                
                
                """.trimIndent()
        }
        if (Burgers.red_spicy_burger > 0) {
            fin_order_string = """
                ${fin_order_string}red_spicy_burger -> ${java.lang.String.valueOf(Burgers.red_spicy_burger)}
                
                
                """.trimIndent()
        }
        if (Burgers.halloumi_burger > 0) {
            fin_order_string = """
                ${fin_order_string}halloumi_burger -> ${java.lang.String.valueOf(Burgers.halloumi_burger)}
                
                
                """.trimIndent()
        }
        if (Burgers.chief_burger > 0) {
            fin_order_string = """
                ${fin_order_string}chief_burger -> ${java.lang.String.valueOf(Burgers.chief_burger)}
                
                
                """.trimIndent()
        }
        if (Desserts.chocolate_chip_cookies > 0) {
            fin_order_string = """
                ${fin_order_string}chocolate_chip_cookies -> ${java.lang.String.valueOf(Desserts.chocolate_chip_cookies)}
                
                
                """.trimIndent()
        }
        if (Desserts.vanilla_cheesecake > 0) {
            fin_order_string = """
                ${fin_order_string}vanilla_cheesecake -> ${java.lang.String.valueOf(Desserts.vanilla_cheesecake)}
                
                
                """.trimIndent()
        }
        if (Desserts.amaretto_apple_cupcakes > 0) {
            fin_order_string = """
                ${fin_order_string}amaretto_apple_cupcakes -> ${java.lang.String.valueOf(Desserts.amaretto_apple_cupcakes)}
                
                
                """.trimIndent()
        }
        if (Desserts.tiramisu > 0) {
            fin_order_string = """
                ${fin_order_string}tiramisu -> ${java.lang.String.valueOf(Desserts.tiramisu)}
                
                
                """.trimIndent()
        }
        if (Desserts.cinnamon_apple_cake > 0) {
            fin_order_string = """
                ${fin_order_string}cinnamon_apple_cake -> ${java.lang.String.valueOf(Desserts.cinnamon_apple_cake)}
                
                
                """.trimIndent()
        }
        if (Desserts.pumpkin_pie_pudding > 0) {
            fin_order_string = """
                ${fin_order_string}pumpkin_pie_pudding -> ${java.lang.String.valueOf(Desserts.pumpkin_pie_pudding)}
                
                
                """.trimIndent()
        }
        if (Desserts.chocolate_cherry_sorbet > 0) {
            fin_order_string = """
                ${fin_order_string}chocolate_cherry_sorbet -> ${java.lang.String.valueOf(Desserts.chocolate_cherry_sorbet)}
                
                
                """.trimIndent()
        }
        if (Desserts.lemon_tart > 0) {
            fin_order_string = """
                ${fin_order_string}lemon_tart -> ${java.lang.String.valueOf(Desserts.lemon_tart)}
                
                
                """.trimIndent()
        }
        if (MainCourse.mustard_stuffed_chicken > 0) {
            fin_order_string = """
                ${fin_order_string}mustard_stuffed_chicken -> ${MainCourse.mustard_stuffed_chicken}
                
                
                """.trimIndent()
        }
        if (MainCourse.parmesan_spring_chicken > 0) {
            fin_order_string = """
                ${fin_order_string}parmesan_spring_chicken -> ${MainCourse.parmesan_spring_chicken}
                
                
                """.trimIndent()
        }
        if (MainCourse.slow_cooked_pulled_pork > 0) {
            fin_order_string = """
                ${fin_order_string}slow_cooked_pulled_pork -> ${MainCourse.slow_cooked_pulled_pork}
                
                
                """.trimIndent()
        }
        if (MainCourse.lasagna > 0) {
            fin_order_string = """
                ${fin_order_string}lasagna -> ${MainCourse.lasagna}
                
                
                """.trimIndent()
        }
        if (MainCourse.grilled_salmon > 0) {
            fin_order_string = """
                ${fin_order_string}grilled_salmon -> ${MainCourse.grilled_salmon}
                
                
                """.trimIndent()
        }
        if (MainCourse.mac_and_cheese > 0) {
            fin_order_string = """
                ${fin_order_string}mac_and_cheese -> ${MainCourse.mac_and_cheese}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.still_water > 0) {
            fin_order_string = """
                ${fin_order_string}still_water -> ${NonAlcoholicDrinks.still_water}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.sparkling_water > 0) {
            fin_order_string = """
                ${fin_order_string}sparkling_water -> ${NonAlcoholicDrinks.sparkling_water}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.coca_cola > 0) {
            fin_order_string = """
                ${fin_order_string}coca_cola -> ${NonAlcoholicDrinks.coca_cola}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.diet_coke > 0) {
            fin_order_string = """
                ${fin_order_string}diet_coke -> ${NonAlcoholicDrinks.diet_coke}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.dr_pepper > 0) {
            fin_order_string = """
                ${fin_order_string}dr_pepper -> ${NonAlcoholicDrinks.dr_pepper}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.sprite > 0) {
            fin_order_string = """
                ${fin_order_string}sprite -> ${NonAlcoholicDrinks.sprite}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.fanta > 0) {
            fin_order_string = """
                ${fin_order_string}fanta -> ${NonAlcoholicDrinks.fanta}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.coffee > 0) {
            fin_order_string = """$fin_order_string coffee-> ${NonAlcoholicDrinks.coffee}

"""
        }
        if (NonAlcoholicDrinks.latte_machiatto > 0) {
            fin_order_string = """
                ${fin_order_string}latte_machiatto -> ${NonAlcoholicDrinks.latte_machiatto}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.tea > 0) {
            fin_order_string = """
                ${fin_order_string}tea -> ${NonAlcoholicDrinks.tea}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.chocolate_milkshake > 0) {
            fin_order_string = """
                ${fin_order_string}chocolate_milkshake -> ${NonAlcoholicDrinks.chocolate_milkshake}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.fresh_orange_juice > 0) {
            fin_order_string = """
                ${fin_order_string}fresh_orange_juice -> ${NonAlcoholicDrinks.fresh_orange_juice}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.peach_juice > 0) {
            fin_order_string = """
                ${fin_order_string}peach_juice -> ${NonAlcoholicDrinks.peach_juice}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.lemonade > 0) {
            fin_order_string = """
                ${fin_order_string}lemonade -> ${NonAlcoholicDrinks.lemonade}
                
                
                """.trimIndent()
        }
        if (NonAlcoholicDrinks.non_alcoholic_beer > 0) {
            fin_order_string = """
                ${fin_order_string}non_alcoholic_beer -> ${NonAlcoholicDrinks.non_alcoholic_beer}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_margherita > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_margherita -> ${Pizza.pizza_margherita}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_vegan > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_vegan -> ${Pizza.pizza_vegan}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_4_cheese > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_4_cheese -> ${Pizza.pizza_4_cheese}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_pepperoni > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_pepperoni -> ${Pizza.pizza_pepperoni}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_meat_passion > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_meat_passion -> ${Pizza.pizza_meat_passion}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_deluxe > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_deluxe -> ${Pizza.pizza_deluxe}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_diavola > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_diavola -> ${Pizza.pizza_diavola}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_ham_mushroom > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_ham_mushroom -> ${Pizza.pizza_ham_mushroom}
                
                
                """.trimIndent()
        }
        if (Pizza.pizza_bbq_chicken > 0) {
            fin_order_string = """
                ${fin_order_string}pizza_bbq_chicken -> ${Pizza.pizza_bbq_chicken}
                
                
                """.trimIndent()
        }
        if (Salads.watermelon_olive_feta_salad > 0) {
            fin_order_string = """
                ${fin_order_string}watermelon_olive_feta_salad -> ${Salads.watermelon_olive_feta_salad}
                
                
                """.trimIndent()
        }
        if (Salads.carrot_salad_black_grape_dressing > 0) {
            fin_order_string = """
                ${fin_order_string}carrot_salad_black_grape_dressing -> ${Salads.carrot_salad_black_grape_dressing}
                
                
                """.trimIndent()
        }
        if (Salads.bbq_potato_salad > 0) {
            fin_order_string = """
                ${fin_order_string}bbq_potato_salad -> ${Salads.bbq_potato_salad}
                
                
                """.trimIndent()
        }
        if (Salads.asian_sesame_chicken_salad > 0) {
            fin_order_string = """
                ${fin_order_string}asian_sesame_chicken_salad -> ${Salads.asian_sesame_chicken_salad}
                
                
                """.trimIndent()
        }
        if (Salads.caprese_salad_pesto_sauce > 0) {
            fin_order_string = """
                ${fin_order_string}caprese_salad_pesto_sauce -> ${Salads.caprese_salad_pesto_sauce}
                
                
                """.trimIndent()
        }
        if (Salads.caesar_salad > 0) {
            fin_order_string = """
                ${fin_order_string}caesar_salad -> ${Salads.caesar_salad}
                
                
                """.trimIndent()
        }
        if (Seafood.bourbon_glazed_salmon > 0) {
            fin_order_string = """
                ${fin_order_string}bourbon_glazed_salmon -> ${Seafood.bourbon_glazed_salmon}
                
                
                """.trimIndent()
        }
        if (Seafood.salmon_croquettes > 0) {
            fin_order_string = """
                ${fin_order_string}salmon_croquettes -> ${Seafood.salmon_croquettes}
                
                
                """.trimIndent()
        }
        if (Seafood.mussels_tomato_wine_broth > 0) {
            fin_order_string = """
                ${fin_order_string}mussels_tomato_wine_broth -> ${Seafood.mussels_tomato_wine_broth}
                
                
                """.trimIndent()
        }
        if (Seafood.pan_fried_trout > 0) {
            fin_order_string = """
                ${fin_order_string}pan_fried_trout -> ${Seafood.pan_fried_trout}
                
                
                """.trimIndent()
        }
        if (Seafood.shrimp_stuffed_shells > 0) {
            fin_order_string = """
                ${fin_order_string}shrimp_stuffed_shells -> ${Seafood.shrimp_stuffed_shells}
                
                
                """.trimIndent()
        }
        if (Seafood.paella > 0) {
            fin_order_string = """
                ${fin_order_string}paella -> ${Seafood.paella}
                
                
                """.trimIndent()
        }
        val temp_order_view = fin_order_string + old_ord_string
        val tv = findViewById<View>(R.id.order_final) as TextView
        tv.text = "" + temp_order_view
    }

    fun main_menu(view: View?) {
        val goto_main_menu = Intent(this, Order_Type::class.java)
        startActivity(goto_main_menu)
        overridePendingTransition(R.anim.fadin, R.anim.fadout)
    }

    fun tot_v() {
        all_total = all_total + old_all_total
        val tv = findViewById<View>(R.id.tot_p) as TextView
        tv.text = "Total price: " + "lei " + all_total
    }


    companion object {
        var client: Socket? = null
        var printwriter: PrintWriter? = null
        var bb: BufferedReader? = null
        var messsage: String? = null
        var m1: String? = null
        @JvmField
        var old_all_total = 0
        @JvmField
        var all_total = 0
        @JvmField
        var next_ord_flag = 0
        @JvmField
        var order_string: String? = null
        @JvmField
        var old_ord_string = ""
    }
}