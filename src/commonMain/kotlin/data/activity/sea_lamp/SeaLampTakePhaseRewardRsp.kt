package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampTakePhaseRewardRsp {
    var retcode: Int
    @AddedIn(VERSION.V0_9_0)
    var phaseId: Int
}