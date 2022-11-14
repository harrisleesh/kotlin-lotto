package lotto.domain

import lotto.dto.LottoResult

class LottoTicketBulk(
    private val lottoTickets: List<LottoTicket>
) {
    fun pickWinnerTickets(winnerTicket: WinnerTicket): List<LottoResult> {
        return lottoTickets.map { winnerTicket.drawResult(it) }
            .filter { it.isWinning() }
    }

    fun size() = lottoTickets.size

    companion object {
        fun of(lottoNumbers: List<Set<Int>>): LottoTicketBulk {
            return LottoTicketBulk(lottoNumbers.map {
                LottoTicket.of(it)
            })
        }
    }
}
