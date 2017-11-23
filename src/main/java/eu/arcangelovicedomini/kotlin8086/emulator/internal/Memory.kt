package eu.arcangelovicedomini.kotlin8086.emulator.internal

class Memory constructor(val size: Int) {

    var data: Array<Boolean> = arrayOf()
        set(data) {
            if (data.size == size)
                this.data = data
            else
                throw IndexOutOfBoundsException("Data (${data.size} bit) is too short or long for this $size bit memory!")
        }

    init {
        for (i in 0..size) {
            data.plus(false)
        }
    }

    override fun toString(): String = "MEMORY[SIZE=$size,DATA={${eu.arcangelovicedomini.kotlin8086.emulator.internal.toString(data)}}]"
}