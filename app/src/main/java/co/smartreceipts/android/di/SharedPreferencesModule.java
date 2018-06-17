package co.smartreceipts.android.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Named;

import co.smartreceipts.android.di.scopes.ApplicationScope;
import co.smartreceipts.android.model.ColumnDefinitions;
import co.smartreceipts.android.model.Receipt;
import co.smartreceipts.android.model.impl.columns.receipts.ReceiptColumnDefinitions;
import co.smartreceipts.android.persistence.DatabaseHelper;
import co.smartreceipts.android.persistence.database.defaults.TableDefaultsCustomizer;
import co.smartreceipts.android.persistence.database.tables.ordering.OrderingPreferencesManager;
import co.smartreceipts.android.settings.UserPreferenceManager;
import dagger.Module;
import dagger.Provides;
import wb.android.storage.StorageManager;

@Module
public class SharedPreferencesModule {

    @Provides
    @ApplicationScope
    @Named(UserPreferenceManager.PREFERENCES_FILE_NAME)
    public static SharedPreferences providesCoreSettingsPreferences(Context context) {
        return context.getSharedPreferences(UserPreferenceManager.PREFERENCES_FILE_NAME, 0);
    }
}