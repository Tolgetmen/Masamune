package com.quillraven.masamune.event

import com.quillraven.masamune.model.EEquipType

interface InputListener {
    fun inputMove(percentX: Float, percentY: Float) {}

    fun inputAction() {}

    fun inputShowInventory() {}

    fun inputShowItem(slotIdx: Int) {}

    fun inputItemMoved(fromSlotIdx: Int, toSlotIdx: Int) {}

    fun inputItemEquipped(inventorySlotIdx: Int, type: EEquipType) {}

    fun inputItemUnequipped(inventorySlotIdx: Int, type: EEquipType) {}
}