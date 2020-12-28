package org.tbk.bitcoin.txstats.example.score;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tbk.bitcoin.txstats.example.score.label.ScoreLabelProvider;

import java.util.List;

@Slf4j
@Configuration
public class TxScoreConfig {

    @Bean
    public TxScoreService txScoreService(List<ScoreLabelProvider> scoreLabelProvider, List<AddressScoreProvider> addressScoreProviders) {
        return new TxScoreServiceImpl(scoreLabelProvider, addressScoreProviders);
    }
}
