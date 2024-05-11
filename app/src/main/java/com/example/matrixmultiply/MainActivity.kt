package com.example.matrixmultiply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matrixmultiply.ui.theme.MatrixMultiplyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatrixMultiplyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    var s11 by remember{mutableStateOf(0)};
                    var s12 by remember{mutableStateOf(0)};
                    var s21 by remember{mutableStateOf(0)};
                    var s22 by remember{mutableStateOf(0)};
                    var t11 by remember{mutableStateOf(0)};
                    var t12 by remember{mutableStateOf(0)};
                    var t21 by remember{mutableStateOf(0)};
                    var t22 by remember{mutableStateOf(0)};

                    var p11 by remember{mutableStateOf(0)};
                    var p12 by remember{mutableStateOf(0)};
                    var p21 by remember{mutableStateOf(0)};
                    var p22 by remember{mutableStateOf(0)};


                    Column(modifier=Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){

                        Text("Matrix Multiplier",modifier=Modifier.padding(10.dp), fontSize = 20.sp,color=Color.Black)
                        // MATRIX S
                        Column(modifier=Modifier.height(120.dp), horizontalAlignment = Alignment.CenterHorizontally){

                        Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { s11=(s11+1)%10 }) {
                            Text(text=s11.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                            }
                            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { s12=(s12+1)%10 }) {
                                Text(text=s12.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                            }

                        }

                            Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { s21=(s21+1)%10 }) {
                                    Text(text=s21.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                                }
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { s22=(s22+1)%10 }) {
                                    Text(text=s22.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                                }

                            }
                        }
                        Spacer(modifier=Modifier.height(10.dp))
                        Text("x",fontSize=30.sp)
                        Spacer(modifier=Modifier.height(10.dp))
                        // MATRIX T

                        Column(modifier=Modifier.height(120.dp), horizontalAlignment = Alignment.CenterHorizontally){

                            Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { t11=(t11+1)%10 }) {
                                    Text(text=t11.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                                }
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { t12=(t12+1)%10 }) {
                                    Text(text=t12.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                                }

                            }

                            Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { t21=(t21+1)%10 }) {
                                    Text(text=t21.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                                }
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue).clickable { t22=(t22+1)%10 }) {
                                    Text(text=t22.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                                }

                            }
                        }
                        Spacer(modifier=Modifier.height(30.dp))
                        Text("=", fontSize = 30.sp)
                        Spacer(modifier=Modifier.height(30.dp))
                        // MATRIX P
                        Column(modifier=Modifier.height(120.dp), horizontalAlignment = Alignment.CenterHorizontally){

                            Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue)) {
                                    Text(text=p11.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                                }
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue)) {
                                    Text(text=p12.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                                }

                            }

                            Row(modifier=Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue)) {
                                    Text(text=p21.toString(),modifier=Modifier.align(Alignment.Center), fontSize = 20.sp,color=Color.White)
                                }
                                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.DarkGray).border(1.dp,Color.Blue)) {
                                    Text(text=p22.toString(),modifier=Modifier.align(Alignment.Center),fontSize = 20.sp,color=Color.White)

                                }

                            }
                        }

                    }



                }
            }
        }

    }
}

