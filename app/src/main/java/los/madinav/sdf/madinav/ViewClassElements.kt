package los.madinav.sdf.madinav

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View

class ViewClassElements (context : Context, attributeSet : AttributeSet) : View(context, attributeSet) {

      private val dataPointLinePaint = Paint().apply {
        color = Color.BLUE
        strokeWidth = 4f
        isAntiAlias = true
    }

    lateinit var floatRectArray : FloatArray

    private val dataPaintMainPath = Paint().apply {
        color = Color.HSVToColor(arrayOf(0.3f, 0.7f, 0.8f).toFloatArray())
        strokeWidth = 10f
        isAntiAlias = true
    }


     private val dataPointLinePaintBlackLine = Paint().apply {
         color = Color.BLACK
         strokeWidth = 3f
         isAntiAlias = true
     }


         private val dataPointLinePaiMAGMENTWKoridor = Paint().apply {
        color = Color.MAGENTA
         strokeWidth = 4f
         isAntiAlias = true
    }

     private val dataPointLinePaiYELLOWKoridor = Paint().apply {
        color = Color.CYAN
         strokeWidth = 4f
         isAntiAlias = true
    }


    private val dataPointLinePaintBlackLText = Paint().apply {
        color = Color.BLACK
        strokeWidth = 2f
        isAntiAlias = true
        textSize = 80f
    }

    private val dataPointLinePaiGreyKoridor = Paint().apply {
        color = Color.GRAY
         strokeWidth = 4f
         isAntiAlias = true
    }


    fun updateArrayFloat() {
            val originalArray: Array<Float> = arrayOf(3.14f, 1.732f, 1.024f, 0.12f)

    // Using toFloatArray() to convert the Array of floating point numbers to a FloatArray
    floatRectArray = originalArray.toFloatArray()
    }

    fun loadAll(){


    }


    fun loadNewPathToDraw(from : Int, to : Int){

        fromMain = from
        toMain = to
        invalidate()
    }


     private fun returnX(number : Int) : Float {
         var floReturn = 0f

         when(number){
              404 ->  floReturn = door_404.x
              405 ->  floReturn = door_405.x
              406 ->  floReturn = door_406.x
              407 ->  floReturn = door_407.x
              408 ->  floReturn = door_408.x
              409 ->  floReturn = door_409.x
              410 ->  floReturn = door_410.x
         }

         return floReturn
     }



      private fun returnY(number : Int) : Float {
         var floReturn = 0f

         when(number){
              404 ->  floReturn = door_404.y
              405 ->  floReturn = door_405.y
              406 ->  floReturn = door_406.y
              407 ->  floReturn = door_407.y
              408 ->  floReturn = door_408.y
              409 ->  floReturn = door_409.y
              410 ->  floReturn = door_410.y
         }

         return floReturn
     }



      override fun onDraw(canvas: Canvas) {
          super.onDraw(canvas)



          // 80.0f, height/2.0f - 570.0f, width/2.0f - 170.0f  height/2.0f - 260.0f

             door_404 = PointF((width/2f - 170 - (width/2f - 170 - 80)/2f), height/2f - 260f)
             door_405 = PointF(width/2.0f - 120.0f, height/2f - 260f)
             door_406 = PointF(width/2.0f - 90.0f, height/2.0f + 330.0f)
             door_407 = PointF(width/2.0f - 90.0f, height/2.0f + 610.0f)
             door_408 = PointF(width/2 +100.0f, height/2.0f + 120f)
             door_409 = PointF(width/2 +95.0f, height/2.0f + 366.0f)
             door_410 = PointF(width/2 +95.0f, height/2.0f + 610f)


             coridor406 = PointF(width/2.0f - 40.0f, height/2.0f + 330.0f)
             coridor407 = PointF(width/2.0f - 40.0f, height/2.0f + 610.0f)
             coridor408 = PointF(width/2 +10.0f, height/2.0f + 120f)
             coridor409 = PointF(width/2 +10.0f, height/2.0f + 366.0f)
             coridor410 = PointF(width/2 +10.0f, height/2.0f + 610f)

             crossCoridor = PointF((width/2f - 170 - (width/2f - 170 - 80)/2f), height/2.0f -175.0f);
             crossCoridorVertical = PointF(width/2.0f , height/2.0f -175.0f)

           // 408
            canvas.drawRect(width/2 +90.0f, height/2.0f, width.toFloat() -10.0f, height/2 + 240.0f, dataPointLinePaint)
           // 409
            canvas.drawRect(width/2 +90.0f, height/2.0f + 244.0f, width.toFloat() -10.0f, height/2 + 484.0f, dataPointLinePaint)

           // 410
          val originalArray: Array<Float> = arrayOf(width/2.0f + 90.0f, height/2.0f + 549.0f, width/2.0f + 90.0f, height/2.0f + 772.0f, width - 10.0f, height/2.0f + 549.0f, width - 10.0f, height/2.0f + 772.0f,
             width/2.0f + 90.0f, height/2.0f + 549.0f, width - 10.0f, height/2.0f + 549.0f, width/2.0f + 90.0f, height/2.0f + 772.0f, width - 10.0f, height/2.0f + 772.0f)

           // Using toFloatArray() to convert the Array of floating point numbers to a FloatArray
             floatRectArray = originalArray.toFloatArray()


          // 404
            val koridorArray : Array<Float> = arrayOf(80.0f, height/2.0f - 570.0f, width/2.0f - 170.0f, height/2.0f - 570.0f,    80.0f, height/2.0f - 570.0f, 80.0f, height/2.0f - 260.0f,
                                    80.0f, height/2.0f - 260.0f, width/2.0f - 170.0f, height/2.0f - 260.0f,    width/2.0f - 170.0f, height/2.0f - 570.0f, width/2.0f - 170.0f, height/2.0f - 260.0f)
            val floatKoriodrPodsobka = koridorArray.toFloatArray()

                // koridor
            canvas.drawRect(width/2.0f - 60.0f, height/2.0f -110.0f, width/2.0f + 60.0f, height.toFloat(), dataPointLinePaiGreyKoridor)
            canvas.drawRect(10.0f, height/2.0f -230.0f, width/2.0f + 60.0f, height/2.0f - 110.0f, dataPointLinePaiGreyKoridor)

            // 410
            canvas.drawLines( floatRectArray, dataPointLinePaintBlackLine)
            // 404
            canvas.drawLines(floatKoriodrPodsobka, dataPointLinePaintBlackLine)


           // podsobka text
            canvas.drawText("404", 160.0f, height/2f - 370f, dataPointLinePaintBlackLText )

          //canvas.drawRect(width/2 +90.0f, height/2.0f + 724.0f, width.toFloat() -10.0f, height/2 + 964.0f, dataPointLinePaint)
            //canvas.drawRect()


          // TODO: Pink Cabinet

           // 406
           canvas.drawRect(60.0f, height/2.0f + 230.0f, width/2.0f - 90.0f, height/2.0f + 430.0f, dataPointLinePaiYELLOWKoridor)
           // 407
           canvas.drawRect(60.0f, height/2.0f + 470.0f, width/2.0f - 90.0f, height/2.0f + 790.0f, dataPointLinePaiYELLOWKoridor)
           canvas.drawText("406", 200f, height/2.0f + 360.0f, dataPointLinePaintBlackLText )
           canvas.drawText("407", 200f, height/2.0f + 650.0f, dataPointLinePaintBlackLText )





           canvas.drawText("408", width/2 +230f, height/2.0f + 160.0f, dataPointLinePaintBlackLText )
           canvas.drawText("409", width/2 +240f, height/2.0f + 380.0f, dataPointLinePaintBlackLText )
           canvas.drawText("410", width/2 +240f, height/2.0f + 690.0f, dataPointLinePaintBlackLText )


          // up magenta cabinet
           // 405
           canvas.drawRect(width/2.0f - 120.0f, height/2.0f - 620.0f, width.toFloat() - 90.0f, height/2.0f - 260.0f, dataPointLinePaiMAGMENTWKoridor)
           canvas.drawText("405", width/2f + 100f, height/2f - 410f, dataPointLinePaintBlackLText )
           // println( " my width = ${width} ")
           // println( " my height = ${height} ")

          if(fromMain != toMain){
             println("drawUpdate")



            //           val originalArray: Array<Float> = arrayOf(width/2.0f + 90.0f, height/2.0f + 549.0f, width/2.0f + 90.0f, height/2.0f + 772.0f, width - 10.0f, height/2.0f + 549.0f, width - 10.0f, height/2.0f + 772.0f,
            //  width/2.0f + 90.0f, height/2.0f + 549.0f, width - 10.0f, height/2.0f + 549.0f, width/2.0f + 90.0f, height/2.0f + 772.0f, width - 10.0f, height/2.0f + 772.0f)
              when(fromMain){

                  404 -> {
                   //if (toMain != 405){

                        val pathDraw : Array<Float> = arrayOf(door_404.x, door_404.y, crossCoridor.x, crossCoridor.y,
                            crossCoridor.x, crossCoridor.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)


                   //}else {

                   //}

                  }


                  405 -> {


                              val pathDraw : Array<Float> = arrayOf(door_405.x, door_405.y, crossCoridorVertical.x, crossCoridorVertical.y,
                            crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)


                  }


                  406 -> {

                      if(toMain == 404 || toMain == 405){
                            val pathDraw : Array<Float> = arrayOf(door_406.x, door_406.y, coridor406.x, coridor406.y,
                            coridor406.x, coridor406.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)
                      }else {

                            val pathDraw : Array<Float> = arrayOf(door_406.x, door_406.y, coridor406.x, coridor406.y,
                            coridor406.x, coridor406.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)

                      }



                  }

                  407 -> {

                       if(toMain == 404 || toMain == 405){
                            val pathDraw : Array<Float> = arrayOf(door_407.x, door_407.y, coridor407.x, coridor407.y,
                            coridor407.x, coridor407.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)
                      }else {

                            val pathDraw : Array<Float> = arrayOf(door_407.x, door_407.y, coridor407.x, coridor407.y,
                            coridor407.x, coridor407.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)

                      }

                  }



                  408 -> {

                           if(toMain == 404 || toMain == 405){
                            val pathDraw : Array<Float> = arrayOf(door_408.x, door_408.y, coridor408.x, coridor408.y,
                            coridor408.x, coridor408.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)
                      }else {

                            val pathDraw : Array<Float> = arrayOf(door_408.x, door_408.y, coridor408.x, coridor408.y,
                            coridor408.x, coridor408.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)

                      }

                  }


                  409 -> {

                             if(toMain == 404 || toMain == 405){
                            val pathDraw : Array<Float> = arrayOf(door_409.x, door_409.y, coridor409.x, coridor409.y,
                            coridor409.x, coridor409.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)
                      }else {

                            val pathDraw : Array<Float> = arrayOf(door_409.x, door_409.y, coridor409.x, coridor409.y,
                            coridor409.x, coridor409.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)

                      }


                  }

                  410 -> {


                             if(toMain == 404 || toMain == 405){
                            val pathDraw : Array<Float> = arrayOf(door_410.x, door_410.y, coridor410.x, coridor410.y,
                            coridor410.x, coridor410.y, crossCoridorVertical.x, crossCoridorVertical.y, crossCoridorVertical.x, crossCoridorVertical.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)
                      }else {

                            val pathDraw : Array<Float> = arrayOf(door_410.x, door_410.y, coridor410.x, coridor410.y,
                            coridor410.x, coridor410.y, returnX(
                                toMain), returnY(toMain))

                       val pathTomainPath = pathDraw.toFloatArray()
                         canvas.drawLines( pathTomainPath, dataPaintMainPath)

                      }

                  }




              }




          }else {
               println(" no drawUpdate - is equal ! ")
          }

      }


    companion object {
         var fromMain = 404
         var toMain   = 404


            var door_404 = PointF(1f, 2f)
            var door_405 = PointF(1f, 2f)
            var door_406 = PointF(1f, 2f)
            var door_407 = PointF(1f, 2f)
            var door_408 = PointF(1f, 2f)
            var door_409 = PointF(1f, 2f)
            var door_410 = PointF(1f, 2f)

            var crossCoridor = PointF(1f, 2f);
            var crossCoridorVertical = PointF(1f, 1f)

            var coridor406 = PointF(1f, 1f)
            var coridor407 = PointF(1f, 1f)
            var coridor408 = PointF(1f, 1f)
            var coridor409 = PointF(1f, 1f)
            var coridor410 = PointF(1f, 1f)
    }
}