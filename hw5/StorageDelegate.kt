package main

import kotlin.reflect.KProperty

class StorageDelegate<T> constructor(key: String, value: T) {

    private val storage: Storage by lazy { Storage() }
    private var key: String = " "

    init {
        this.key = key
        when (value) {
            is String -> storage.put(key, value)
            is Int -> storage.put(key, value)
            is Long -> storage.put(key, value)
            is Char -> storage.put(key, value)
            is Double -> storage.put(key, value)
            else -> throw IllegalArgumentException()
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        val result: T? = storage.get(key) as? T

        if (result == null) {
            throw IllegalArgumentException()
        }

        return result
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        storage.put(key, value)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        storage.put(key, value)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
        storage.put(key, value)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Char) {
        storage.put(key, value)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
        storage.put(key, value)
    }
}