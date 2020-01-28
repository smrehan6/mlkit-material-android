package com.google.firebase.ml.md.kotlin.camera

import java.nio.ByteBuffer

interface FrameProcessor {

    fun process(data: ByteBuffer, frameMetadata: FrameMetadata, graphicOverlay: GraphicOverlay)

    fun stop()
}
