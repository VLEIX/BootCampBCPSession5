package com.frantun.bootcampbcpsession5

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.frantun.bootcampbcpsession5.model.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1
        val car = buildCar()

        val message = car.desc?.let {
            it
        } ?: run {
            "description is null"
        }

        Log.d("MainActivity", message)

        // 2
        val computer = Computer("name", "brand")
        val computer2 = Computer2(name = "nnn", model = "mmm")

        Log.d("MainActivity", computer2.toString())

        // 3 - lists
        val petList = buildPets()

//        val petListFiltered = ArrayList<Pet>()
//        petList.forEach {
//            if (it.owner.age == 21) {
//                petListFiltered.add(it)
//            }
//        }
        val petListFiltered = petList.filter { it.owner.age in 20..25 }.sortedByDescending { it.name }
        val nameList: List<String> = petList.map { it.owner.name }.distinct()
        Log.d("MainActivity", nameList.toString())
    }

    private fun buildPets(): List<Pet> {
        val owner1 = Owner("Daniela", 21)
        val owner2 = Owner("Danny", 21)
        val owner3 = Owner("Gerardo", 28)

        return listOf(
            Pet("bobby", owner1),
            Pet("firu", owner1),
            Pet("lais", owner1),
            Pet("lorenzo", owner2),
            Pet("michi", owner3),
            Pet("fus", owner3)
        )
    }

//    private fun buildCar(): Car {
//        val car = Car()
//        car.name = "carrito"
//        car.desc = "se malogra"
//
//        return car
//    }

//    private fun buildCar(): Car {
//        val car = Car().apply {
//            name = "carrito"
//            desc = "se malogra"
//        }
//
//        return car
//    }

//    private fun buildCar(): Car {
//        return Car().apply {
//            name = "carrito"
//            desc = "se malogra"
//        }
//    }

//    private fun buildCar(): Car = Car().apply {
//        name = "carrito"
//        desc = "se malogra"
//    }

    private fun buildCar() = Car().apply {
        name = "carrito"
        desc = null
    }
}