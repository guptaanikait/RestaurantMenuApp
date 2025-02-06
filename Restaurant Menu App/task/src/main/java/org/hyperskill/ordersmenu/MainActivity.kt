package org.hyperskill.ordersmenu

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.hyperskill.ordersmenu.theme.PlayOrdersMenuTheme
/*var recipesNameToStockAmount=
    mutableStateMapOf<String,Int>(
        "Fettuccine" to 5,
        "Risotto" to 6,
        "Gnocchi" to 4,
        "Spaghetti" to 3,
        "Lasagna" to 5,
        "Steak Parmigiana" to 2
    )
/*mutableMapOf(
    "Fettuccine" to 5,
    "Risotto" to 6,
    "Gnocchi" to 4,
    "Spaghetti" to 3,
    "Lasagna" to 5,
    "Steak Parmigiana" to 2
)*/
var amountOrdered1=mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState1 = derivedStateOf {
    amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
}
var amountOrdered2= mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState2 = derivedStateOf {
    amountOrdered2.value == recipesNameToStockAmount["Risotto"]
}
var amountOrdered3= mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState3 = derivedStateOf {
    amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
}
var amountOrdered4= mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState4 = derivedStateOf {
    amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
}
var amountOrdered5= mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState5 = derivedStateOf {
    amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
}
var amountOrdered6= mutableStateOf(0)
//var color=remember{ mutableStateOf("Black") }
var derivedState6 = derivedStateOf {
    amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
}*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayOrdersMenuTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    /*var amountOrdered1= remember{mutableStateOf(0)}
                    //var color=remember{ mutableStateOf("Black") }
                    var derivedState1 = remember{derivedStateOf {
                        amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                    }}*/
                    var recipesNameToStockAmount= remember {
                        mutableStateMapOf<String, Int>(
                            "Fettuccine" to 5,
                            "Risotto" to 6,
                            "Gnocchi" to 4,
                            "Spaghetti" to 3,
                            "Lasagna" to 5,
                            "Steak Parmigiana" to 2
                        )
                    }
                    /*mutableMapOf(
                        "Fettuccine" to 5,
                        "Risotto" to 6,
                        "Gnocchi" to 4,
                        "Spaghetti" to 3,
                        "Lasagna" to 5,
                        "Steak Parmigiana" to 2
                    )*/
                    var amountOrdered1= remember {  mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState1 = remember{derivedStateOf {
                        amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                    }}
                    var amountOrdered2= remember{mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState2 = remember{derivedStateOf {
                        amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                    }}
                    var amountOrdered3= remember{mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState3 = remember{derivedStateOf {
                        amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                    }}
                    var amountOrdered4= remember{mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState4 = remember{derivedStateOf {
                        amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                    }}
                    var amountOrdered5= remember{mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState5 = remember{derivedStateOf {
                        amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                    }}
                    var amountOrdered6= remember{mutableStateOf(0)}
//var color=remember{ mutableStateOf("Black") }
                    var derivedState6 = remember{derivedStateOf {
                        amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                    }}
                    Column() {
                        Text(
                            text = "Orders Menu",
                            fontSize = 48.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        //MenuItem1()
                        //MenuItem2()
                        //MenuItem3()
                        //MenuItem4()
                        //MenuItem5()
                        //MenuItem6()
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if(!derivedState1.value) {
                                Text(
                                    text = "Fettuccine",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color=Color.Black
                                )
                            }
                            else{
                                Text(
                                    text = "Fettuccine",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if(amountOrdered1.value< recipesNameToStockAmount["Fettuccine"]!!) {
                                    amountOrdered1.value++
                                    derivedState1 = derivedStateOf {
                                        amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                                    }
                                }
                            }) {
                                Text(text="+")
                            }
                            Text(
                                text=amountOrdered1.value.toString(),

                                )
                            TextButton(onClick = {
                                if(amountOrdered1.value>0) {
                                    amountOrdered1.value--
                                    derivedState1 = derivedStateOf {
                                        amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                                    }
                                }
                            }) {
                                Text(text="-")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if(!derivedState2.value) {
                                Text(
                                    text = "Risotto",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color=Color.Black
                                )
                            }
                            else{
                                Text(
                                    text = "Risotto",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if(amountOrdered2.value< recipesNameToStockAmount["Risotto"]!!) {
                                    amountOrdered2.value++
                                    derivedState2 = derivedStateOf {
                                        amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                                    }
                                }
                            }) {
                                Text(text="+")
                            }
                            Text(
                                text=amountOrdered2.value.toString(),

                                )
                            TextButton(onClick = {
                                if(amountOrdered2.value>0) {
                                    amountOrdered2.value--
                                    derivedState2 = derivedStateOf {
                                        amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                                    }
                                }
                            }) {
                                Text(text="-")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if (!derivedState3.value) {
                                Text(
                                    text = "Gnocchi",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Black
                                )
                            } else {
                                Text(
                                    text = "Gnocchi",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if (amountOrdered3.value < recipesNameToStockAmount["Gnocchi"]!!) {
                                    amountOrdered3.value++
                                    derivedState3 = derivedStateOf {
                                        amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                                    }
                                }
                            }) {
                                Text(text = "+")
                            }
                            Text(
                                text = amountOrdered3.value.toString(),

                                )
                            TextButton(onClick = {
                                if (amountOrdered3.value > 0) {
                                    amountOrdered3.value--
                                    derivedState3 = derivedStateOf {
                                        amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                                    }
                                }
                            }) {
                                Text(text = "-")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if(!derivedState4.value) {
                                Text(
                                    text = "Spaghetti",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color=Color.Black
                                )
                            }
                            else{
                                Text(
                                    text = "Spaghetti",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if(amountOrdered4.value< recipesNameToStockAmount["Spaghetti"]!!) {
                                    amountOrdered4.value++
                                    derivedState4 = derivedStateOf {
                                        amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                                    }
                                }
                            }) {
                                Text(text="+")
                            }
                            Text(
                                text=amountOrdered4.value.toString(),

                                )
                            TextButton(onClick = {
                                if(amountOrdered4.value>0) {
                                    amountOrdered4.value--
                                    derivedState4 = derivedStateOf {
                                        amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                                    }
                                }
                            }) {
                                Text(text="-")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if(!derivedState5.value) {
                                Text(
                                    text = "Lasagna",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color=Color.Black
                                )
                            }
                            else{
                                Text(
                                    text = "Lasagna",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if(amountOrdered5.value< recipesNameToStockAmount["Lasagna"]!!) {
                                    amountOrdered5.value++
                                    derivedState5 = derivedStateOf {
                                        amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                                    }
                                }
                            }) {
                                Text(text="+")
                            }
                            Text(
                                text=amountOrdered5.value.toString(),

                                )
                            TextButton(onClick = {
                                if(amountOrdered5.value>0) {
                                    amountOrdered5.value--
                                    derivedState5 = derivedStateOf {
                                        amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                                    }
                                }
                            }) {
                                Text(text="-")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            if(!derivedState6.value) {
                                Text(
                                    text = "Steak Parmigiana",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color=Color.Black
                                )
                            }
                            else{
                                Text(
                                    text = "Steak Parmigiana",
                                    fontSize = 24.sp,
                                    textAlign = TextAlign.Left,
                                    color = Color.Red
                                )
                            }
                            TextButton(onClick = {
                                if(amountOrdered6.value< recipesNameToStockAmount["Steak Parmigiana"]!!) {
                                    amountOrdered6.value++
                                    derivedState6 = derivedStateOf {
                                        amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                                    }
                                }
                            }) {
                                Text(text="+")
                            }
                            Text(
                                text=amountOrdered6.value.toString(),

                                )
                            TextButton(onClick = {
                                if(amountOrdered6.value>0) {
                                    amountOrdered6.value--
                                    derivedState6 = derivedStateOf {
                                        amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                                    }
                                }
                            }) {
                                Text(text="-")
                            }
                        }





                        Column(
                            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            //verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(colors = ButtonDefaults.buttonColors(
                                contentColor = Color.White,
                                backgroundColor = Color.Black

                            ), onClick = {
                                if (amountOrdered1.value == 0 && amountOrdered2.value == 0 && amountOrdered3.value == 0 && amountOrdered4.value == 0 && amountOrdered5.value == 0 && amountOrdered6.value == 0) {

                                } else {
                                    var toshow = "Ordered:"
                                    if (amountOrdered1.value > 0) {
                                        toshow += "\n==> Fettuccine: ${amountOrdered1.value}"
                                        recipesNameToStockAmount["Fettuccine"] =
                                            recipesNameToStockAmount["Fettuccine"]!! - amountOrdered1.value
                                        amountOrdered1.value = 0
                                        derivedState1 = derivedStateOf {
                                            amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                                        }
                                    }
                                    if (amountOrdered2.value > 0) {
                                        toshow += "\n==> Risotto: ${amountOrdered2.value}"
                                        recipesNameToStockAmount["Risotto"] =
                                            recipesNameToStockAmount["Risotto"]!! - amountOrdered2.value
                                        amountOrdered2.value = 0
                                        derivedState2 = derivedStateOf {
                                            amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                                        }
                                    }
                                    if (amountOrdered3.value > 0) {
                                        toshow += "\n==> Gnocchi: ${amountOrdered3.value}"
                                        recipesNameToStockAmount["Gnocchi"] =
                                            recipesNameToStockAmount["Gnocchi"]!! - amountOrdered3.value
                                        amountOrdered3.value = 0
                                        derivedState3 = derivedStateOf {
                                            amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                                        }
                                    }
                                        if (amountOrdered4.value > 0) {
                                            toshow += "\n==> Spaghetti: ${amountOrdered4.value}"
                                            recipesNameToStockAmount["Spaghetti"] =
                                                recipesNameToStockAmount["Spaghetti"]!! - amountOrdered4.value
                                            amountOrdered4.value = 0
                                            derivedState4 = derivedStateOf {
                                                amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                                            }
                                        }
                                        if (amountOrdered5.value > 0) {
                                            toshow += "\n==> Lasagna: ${amountOrdered5.value}"
                                            recipesNameToStockAmount["Lasagna"] =
                                                recipesNameToStockAmount["Lasagna"]!! - amountOrdered5.value
                                            amountOrdered5.value = 0
                                            derivedState5 = derivedStateOf {
                                                amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                                            }
                                        }
                                        if (amountOrdered6.value > 0) {
                                            toshow += "\n==> Steak Parmigiana: ${amountOrdered6.value}"
                                            recipesNameToStockAmount["Steak Parmigiana"] =
                                                recipesNameToStockAmount["Steak Parmigiana"]!! - amountOrdered6.value
                                            amountOrdered6.value = 0
                                            derivedState6 = derivedStateOf {
                                                amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                                            }
                                        }
                                        //toshow-="\n"
                                        val toast = Toast.makeText(
                                            this@MainActivity,
                                            toshow,
                                            Toast.LENGTH_SHORT
                                        ).show()

                                    }
                                }) {
                                Text(text = "Make Order", fontSize = 24.sp)
                            }

                        }



                    }

                }
            }
        }
    }
}

/*@Composable
fun MenuItem1() {
    /*var amountOrdered1= remember{mutableStateOf(0)}
    //var color=remember{ mutableStateOf("Black") }
    var derivedState1 = remember{derivedStateOf {
        amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
    }}*/
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState1.value) {
            Text(
                text = "Fettuccine",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Fettuccine",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered1.value< recipesNameToStockAmount["Fettuccine"]!!) {
                amountOrdered1.value++
                derivedState1 = derivedStateOf {
                    amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered1.value.toString(),

        )
        TextButton(onClick = {
            if(amountOrdered1.value>0) {
                amountOrdered1.value--
                derivedState1 = derivedStateOf {
                    amountOrdered1.value == recipesNameToStockAmount["Fettuccine"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}
@Composable
fun MenuItem2() {
    /*var amountOrdered2= remember{mutableStateOf(0)}
    //var color=remember{ mutableStateOf("Black") }
    val derivedState2 = remember{derivedStateOf {
        amountOrdered2.value == recipesNameToStockAmount["Risotto"]
    }}*/
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState2.value) {
            Text(
                text = "Risotto",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Risotto",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered2.value< recipesNameToStockAmount["Risotto"]!!) {
                amountOrdered2.value++
                derivedState2 = derivedStateOf {
                    amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered2.value.toString(),

            )
        TextButton(onClick = {
            if(amountOrdered2.value>0) {
                amountOrdered2.value--
                derivedState2 = derivedStateOf {
                    amountOrdered2.value == recipesNameToStockAmount["Risotto"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}
@Composable
fun MenuItem3() {
    /*var amountOrdered3= remember{mutableStateOf(0)}
    //var color=remember{ mutableStateOf("Black") }
    val derivedState3 = remember{derivedStateOf {
        amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
    }}*/
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState3.value) {
            Text(
                text = "Gnocchi",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Gnocchi",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered3.value< recipesNameToStockAmount["Gnocchi"]!!) {
                amountOrdered3.value++
                derivedState3 = derivedStateOf {
                    amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered3.value.toString(),

            )
        TextButton(onClick = {
            if(amountOrdered3.value>0) {
                amountOrdered3.value--
                derivedState3 = derivedStateOf {
                    amountOrdered3.value == recipesNameToStockAmount["Gnocchi"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}
@Composable
fun MenuItem4() {
    /*var amountOrdered4= remember{mutableStateOf(0)}
    //var color=remember{ mutableStateOf("Black") }
    val derivedState4 = remember{derivedStateOf {
        amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
    }}*/
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState4.value) {
            Text(
                text = "Spaghetti",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Spaghetti",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered4.value< recipesNameToStockAmount["Spaghetti"]!!) {
                amountOrdered4.value++
                derivedState4 = derivedStateOf {
                    amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered4.value.toString(),

            )
        TextButton(onClick = {
            if(amountOrdered4.value>0) {
                amountOrdered4.value--
                derivedState4 = derivedStateOf {
                    amountOrdered4.value == recipesNameToStockAmount["Spaghetti"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}
@Composable
fun MenuItem5() {
//    var amountOrdered5= remember{mutableStateOf(0)}
//    //var color=remember{ mutableStateOf("Black") }
//    val derivedState5 = remember{derivedStateOf {
//        amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
//    }}
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState5.value) {
            Text(
                text = "Lasagna",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Lasagna",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered5.value< recipesNameToStockAmount["Lasagna"]!!) {
                amountOrdered5.value++
                derivedState5 = derivedStateOf {
                    amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered5.value.toString(),

            )
        TextButton(onClick = {
            if(amountOrdered5.value>0) {
                amountOrdered5.value--
                derivedState5 = derivedStateOf {
                    amountOrdered5.value == recipesNameToStockAmount["Lasagna"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}
@Composable
fun MenuItem6() {
    /*var amountOrdered6= remember{mutableStateOf(0)}
    //var color=remember{ mutableStateOf("Black") }
    val derivedState6 = remember{derivedStateOf {
        amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
    }}*/
    Row(verticalAlignment = Alignment.CenterVertically) {
        if(!derivedState6.value) {
            Text(
                text = "Steak Parmigiana",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color=Color.Black
            )
        }
        else{
            Text(
                text = "Steak Parmigiana",
                fontSize = 24.sp,
                textAlign = TextAlign.Left,
                color = Color.Red
            )
        }
        TextButton(onClick = {
            if(amountOrdered6.value< recipesNameToStockAmount["Steak Parmigiana"]!!) {
                amountOrdered6.value++
                derivedState6 = derivedStateOf {
                    amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                }
            }
        }) {
            Text(text="+")
        }
        Text(
            text=amountOrdered6.value.toString(),

            )
        TextButton(onClick = {
            if(amountOrdered6.value>0) {
                amountOrdered6.value--
                derivedState6 = derivedStateOf {
                    amountOrdered6.value == recipesNameToStockAmount["Steak Parmigiana"]
                }
            }
        }) {
            Text(text="-")
        }
    }


}*/
/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlayOrdersMenuTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column() {
                Text(
                    text = "Orders Menu",
                    fontSize = 48.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(500.dp)
                )
                MenuItem1()
                MenuItem2()
                MenuItem3()
                MenuItem4()
                MenuItem5()
                MenuItem6()
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    //verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        backgroundColor = Color.Black

                    ), onClick = {
                        if (amountOrdered1.value == 0 && amountOrdered2.value == 0 && amountOrdered3.value == 0 && amountOrdered4.value == 0 && amountOrdered5.value == 0 && amountOrdered6.value == 0) {

                        } else {
                            var toshow = "Ordered:\\n"
                            if (amountOrdered1.value > 0) {
                                toshow += "Fettuccine:${amountOrdered1.value}\\n"
                                recipesNameToStockAmount["Fettuccine"] =
                                    recipesNameToStockAmount["Fettuccine"]!! - amountOrdered1.value
                                amountOrdered1.value = 0
                            }
                            if (amountOrdered2.value > 0) {
                                toshow += "Risotto:${amountOrdered2.value}\\n"
                                recipesNameToStockAmount["Risotto"] =
                                    recipesNameToStockAmount["Risotto"]!! - amountOrdered2.value
                                amountOrdered2.value = 0
                            }
                            if (amountOrdered3.value > 0) {
                                toshow += "Gnocchi:${amountOrdered3.value}\\n"
                                recipesNameToStockAmount["Gnocchi"] =
                                    recipesNameToStockAmount["Gnocchi"]!! - amountOrdered3.value
                                amountOrdered3.value = 0
                            }
                            if (amountOrdered4.value > 0) {
                                toshow += "Spaghetti:${amountOrdered4.value}\\n"
                                recipesNameToStockAmount["Spaghetti"] =
                                    recipesNameToStockAmount["Spaghetti"]!! - amountOrdered4.value
                                amountOrdered4.value = 0
                            }
                            if (amountOrdered5.value > 0) {
                                toshow += "Lasagna:${amountOrdered5.value}\\n"
                                recipesNameToStockAmount["Lasagna"] =
                                    recipesNameToStockAmount["Lasagna"]!! - amountOrdered5.value
                                amountOrdered5.value = 0
                            }
                            if (amountOrdered6.value > 0) {
                                toshow += "Steak Parmigiana:${amountOrdered6.value}\\n"
                                recipesNameToStockAmount["Steak Parmigiana"] =
                                    recipesNameToStockAmount["Steak Parmigiana"]!! - amountOrdered6.value
                                amountOrdered6.value = 0
                            }
                            //toshow-="\n"


                        }
                    }) {
                        Text(text = "Make Order", fontSize = 24.sp)
                    }
                }



            }

        }
    }
}*/