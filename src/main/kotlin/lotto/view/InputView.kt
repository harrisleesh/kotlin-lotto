package lotto.view

class InputView {
    companion object {
        fun askPurchaseAmount(): Int {
            println("구입금액을 입력해 주세요.")
            return readln().toInt()
        }

        fun askWinnerNumber(): Set<Int> {
            println("지난 주 당첨 번호를 입력해 주세요.")
            return readln().split(", ")
                .map { it.toInt() }
                .toSet()
        }

        fun askBonusNumber(): Int {
            println("보너스 볼을 입력해 주세요.")
            return readln().toInt()
        }

        fun askManualPurchaseCount(): Int {
            println("수동으로 구매할 로또 수를 입력해 주세요.")
            return readln().toInt()
        }

        fun askManualLottoTicketNumbers(manualCount: Int): List<Set<Int>> {
            println("수동으로 구매할 번호를 입력해 주세요.")
            return (1..manualCount).map {
                readln().split(", ")
                    .map { it.toInt() }
                    .toSet()
            }
        }
    }
}
