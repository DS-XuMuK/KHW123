fun main() {
    val amount = 11000
    val isMusicLover = true
    var amountAfterDiscount = when (amount) {
        in 0..1000 -> amount * 100
        in 1001..10_000 -> (amount - 100) * 100
        else -> amount * 95
    }
    if (isMusicLover) {
        amountAfterDiscount = (amountAfterDiscount * 0.99).toInt()
    }
    println("����� �������: $amount ���")
    if (amount == (amountAfterDiscount / 100)) {
        println("������ �� ���������")
        return
    }
    println("����� ����� ���������� ������: " + (amountAfterDiscount / 100) + " ��� "
            + (amountAfterDiscount % 100) + " ���")
}