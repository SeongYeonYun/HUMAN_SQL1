
# 범주형 변수 인코딩 (LightGBM 최적 방식)
categorical_cols = ['gender', 'activity', 'smoke_status', 'medical_history',
                    'family_medical_history', 'sleep_pattern', 'edu_level']

for col in categorical_cols:
    df[col] = df[col].fillna('Unknown').astype('category')
