package io.ktor.experimental.client.util

import io.ktor.network.sockets.*
import io.ktor.network.tls.*

suspend fun Socket.optTls(tls: Boolean): Socket = if (tls) tls() else this
