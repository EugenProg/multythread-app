package kz.just_code.threadapp

class Car {
    private var color: String = "Gray"
    private var doorCount: Int = 5
    private var ton: Boolean = false

    class Builder {
        private var color: String? = null
        private var doorCount: Int? = null
        private var ton: Boolean? = null

        fun setColor(color: String): Builder {
            this.color = color
            return this
        }

        fun setDoorCount(count: Int): Builder {
            this.doorCount = count
            return this
        }

        fun setTon(ton: Boolean): Builder {
            this.ton = ton
            return this
        }

        fun build(): Car {
            val car = Car()
            color?.let {
                car.color = it
            }
            doorCount?.let {
                car.doorCount = it
            }
            ton?.let {
                car.ton = it
            }

            return car
        }
    }

    override fun toString(): String {
        return "color: $color, doorCount: $doorCount, ton: $ton"
    }
}