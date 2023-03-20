package datapath
import chisel3._
import chisel3.util.experimental.loadMemoryFromFile


class InstructionMem extends Module {
    val io = IO(new Bundle {
            val wrAddr = Input(UInt(10.W))
            val readData = Output(UInt(32.W))
    })

    val mem = Mem(1024, UInt(32.W))
    loadMemoryFromFile(mem, "/chisel/instruction.txt")
    io.readData := mem(io.wrAddr)
}
